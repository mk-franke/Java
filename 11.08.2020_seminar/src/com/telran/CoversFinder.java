package com.telran;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class CoversFinder {

    public List<Integer> getNumCovers(List<Integer> points, List<Segment> segments) {
        List<Integer> res = new ArrayList<>();
        for (int p : points) {
            int cover = 0;
            for (Segment s : segments) {
                if (s.left <= p && s.right >= p) {
                    cover++;
                }
            }
            res.add(cover);
        }
        return res;
    }

    public List<Integer> find(List<Integer> numbers, List<Segment> segments) {
        List<Point> points = collectPoints(numbers, segments);
        List<Integer> result = new ArrayList<>();
        int currentCover = 0;
        for (Point p : points){
            if (p.status == PointStatus.DEFAULT) {
                result.add(currentCover);
            } else if (p.status == PointStatus.LEFT) {
                currentCover++;
            } else {
                currentCover--;
            }
        }
        return result;
    }

    private List<Point> collectPoints(List<Integer> numbers, List<Segment> segments) {
        List<Point> points = numbers.stream()
                                    .map(num -> new Point(num, PointStatus.DEFAULT))
                                    .collect(Collectors.toList());

        points.addAll(segments.stream()
                            .flatMap(segment -> Stream.of(
                                        new Point(segment.left, PointStatus.LEFT),
                                        new Point(segment.right, PointStatus.RIGHT)
                            ))
                            .collect(Collectors.toList())
        );
        Collections.sort(points);
        return points;
    }

}
