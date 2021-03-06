package map.task5;

import org.junit.Test;

import java.util.HashMap;
import java.util.Map;

import static org.junit.Assert.assertEquals;

public class MostCommonWordTest {

    @Test
    public void testMostCommonWord() {
        String text = "Статья 1\n" +
                "1. Российская Федерация - Россия есть демократическое федеративное правовое государство с республиканской формой правления.\n" +
                "2. Наименования Российская Федерация и Россия равнозначны.\n" +
                "Статья 2\n" +
                "Человек, его права и свободы являются высшей ценностью. Признание, соблюдение и защита прав и свобод человека и гражданина - обязанность государства.\n" +
                "Статья 3\n" +
                "1. Носителем суверенитета и единственным источником власти в Российской Федерации является ее многонациональный народ.\n" +
                "2. Народ осуществляет свою власть непосредственно, а также через органы государственной власти и органы местного самоуправления.\n" +
                "3. Высшим непосредственным выражением власти народа являются референдум и свободные выборы.\n" +
                "4. Никто не может присваивать власть в Российской Федерации. Захват власти или присвоение властных полномочий преследуется по федеральному закону.\n" +
                "Статья 4\n" +
                "1. Суверенитет Российской Федерации распространяется на всю ее территорию.\n" +
                "2. Конституция Российской Федерации и федеральные законы имеют верховенство на всей территории Российской Федерации.\n" +
                "3. Российская Федерация обеспечивает целостность и неприкосновенность своей территории.\n" +
                "Статья 5\n" +
                "1. Российская Федерация состоит из республик, краев, областей, городов федерального значения, автономной области, автономных округов - равноправных субъектов Российской Федерации.\n" +
                "2. Республика (государство) имеет свою конституцию и законодательство. Край, область, город федерального значения, автономная область, автономный округ имеет свой устав и законодательство.\n" +
                "3. Федеративное устройство Российской Федерации основано на ее государственной целостности, единстве системы государственной власти, разграничении предметов ведения и полномочий между органами государственной власти Российской Федерации и органами государственной власти субъектов Российской Федерации, равноправии и самоопределении народов в Российской Федерации.\n" +
                "4. Во взаимоотношениях с федеральными органами государственной власти все субъекты Российской Федерации между собой равноправны.\n" +
                "Статья 6\n" +
                "1. Гражданство Российской Федерации приобретается и прекращается в соответствии с федеральным законом, является единым и равным независимо от оснований приобретения.\n" +
                "2. Каждый гражданин Российской Федерации обладает на ее территории всеми правами и свободами и несет равные обязанности, предусмотренные Конституцией Российской Федерации.\n" +
                "3. Гражданин Российской Федерации не может быть лишен своего гражданства или права изменить его.\n" +
                "Статья 7\n" +
                "1. Российская Федерация - социальное государство, политика которого направлена на создание условий, обеспечивающих достойную жизнь и свободное развитие человека.\n" +
                "2. В Российской Федерации охраняются труд и здоровье людей, устанавливается гарантированный минимальный размер оплаты труда, обеспечивается государственная поддержка семьи, материнства, отцовства и детства, инвалидов и пожилых граждан, развивается система социальных служб, устанавливаются государственные пенсии, пособия и иные гарантии социальной защиты.\n" +
                "Статья 8\n" +
                "1. В Российской Федерации гарантируются единство экономического пространства, свободное перемещение товаров, услуг и финансовых средств, поддержка конкуренции, свобода экономической деятельности.\n" +
                "2. В Российской Федерации признаются и защищаются равным образом частная, государственная, муниципальная и иные формы собственности.\n" +
                "Статья 9\n" +
                "1. Земля и другие природные ресурсы используются и охраняются в Российской Федерации как основа жизни и деятельности народов, проживающих на соответствующей территории.\n" +
                "2. Земля и другие природные ресурсы могут находиться в частной, государственной, муниципальной и иных формах собственности.\n" +
                "Статья 10\n" +
                "Государственная власть в Российской Федерации осуществляется на основе разделения на законодательную, исполнительную и судебную. Органы законодательной, исполнительной и судебной власти самостоятельны.\n" +
                "Статья 11\n" +
                "1. Государственную власть в Российской Федерации осуществляют Президент Российской Федерации, Федеральное Собрание (Совет Федерации и Государственная Дума), Правительство Российской Федерации, суды Российской Федерации.\n" +
                "2. Государственную власть в субъектах Российской Федерации осуществляют образуемые ими органы государственной власти.\n" +
                "3. Разграничение предметов ведения и полномочий между органами государственной власти Российской Федерации и органами государственной власти субъектов Российской Федерации осуществляется настоящей Конституцией, Федеративным и иными договорами о разграничении предметов ведения и полномочий.\n" +
                "Статья 12\n" +
                "В Российской Федерации признается и гарантируется местное самоуправление. Местное самоуправление в пределах своих полномочий самостоятельно. Органы местного самоуправления не входят в систему органов государственной власти.\n" +
                "Статья 13\n" +
                "1. В Российской Федерации признается идеологическое многообразие.\n" +
                "2. Никакая идеология не может устанавливаться в качестве государственной или обязательной.\n" +
                "3. В Российской Федерации признаются политическое многообразие, многопартийность.\n" +
                "4. Общественные объединения равны перед законом.\n" +
                "5. Запрещается создание и деятельность общественных объединений, цели или действия которых направлены на насильственное изменение основ конституционного строя и нарушение целостности Российской Федерации, подрыв безопасности государства, создание вооруженных формирований, разжигание социальной, расовой, национальной и религиозной розни.\n" +
                "Статья 14\n" +
                "1. Российская Федерация - светское государство. Никакая религия не может устанавливаться в качестве государственной или обязательной.\n" +
                "2. Религиозные объединения отделены от государства и равны перед законом.\n" +
                "Статья 15\n" +
                "1. Конституция Российской Федерации имеет высшую юридическую силу, прямое действие и применяется на всей территории Российской Федерации. Законы и иные правовые акты, принимаемые в Российской Федерации, не должны противоречить Конституции Российской Федерации.\n" +
                "2. Органы государственной власти, органы местного самоуправления, должностные лица, граждане и их объединения обязаны соблюдать Конституцию Российской Федерации и законы.\n" +
                "3. Законы подлежат официальному опубликованию. Неопубликованные законы не применяются. Любые нормативные правовые акты, затрагивающие права, свободы и обязанности человека и гражданина, не могут применяться, если они не опубликованы официально для всеобщего сведения.\n" +
                "4. Общепризнанные принципы и нормы международного права и международные договоры Российской Федерации являются составной частью ее правовой системы. Если международным договором Российской Федерации установлены иные правила, чем предусмотренные законом, то применяются правила международного договора.\n" +
                "Статья 16\n" +
                "1. Положения настоящей главы Конституции составляют основы конституционного строя Российской Федерации и не могут быть изменены иначе как в порядке, установленном настоящей Конституцией.\n" +
                "2. Никакие другие положения настоящей Конституции не могут противоречить основам конституционного строя Российской Федерации.";
        Map<String, Integer> expected = new HashMap<>();
        expected.put("Федерации", 41);
        Map<String, Integer> actual = MostCommonWord.mostCommonWordCount(text);
        assertEquals(expected, actual);
    }

}