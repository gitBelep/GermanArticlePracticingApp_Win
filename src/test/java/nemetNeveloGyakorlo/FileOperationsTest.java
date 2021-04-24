package nemetNeveloGyakorlo;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;
import static nemetNeveloGyakorlo.FileOperations.OLD_RESULTS;

class FileOperationsTest {

    @Test
    void getDictionaryFiles() {
        FileOperations fo = new FileOperations();
        assertEquals(4, fo.getDictionaryFiles().size());
    }

    //use it only with purpose!
//    @Test
//    void createsNewDataFiles() {
//        FileOperations fo = new FileOperations();
//
//        List<Result> res = new ArrayList<>();
//        res.add(new Result(15, 20, "növény", GameType.ARTICLE_TO_GERMAN, "Sicc", LocalDateTime.of(2011, 10, 7, 15, 2)));
//        res.add(new Result(14, 10, "növény", GameType.GERMAN_TO_HUN, "Árvíztűrő Özséb", LocalDateTime.of(1998, 12, 7, 15, 2)));
//        res.add(new Result(13, 2, "növény", GameType.GERMAN_TO_HUN, "Baba Jaga", LocalDateTime.of(2000, 11, 7, 15, 2)));
//        res.add(new Result(12, 1, "testrészek", GameType.GERMAN_TO_HUN, "Baba Jaga", LocalDateTime.of(2021, 1, 1, 15, 2)));
//
//        OLD_RESULTS = res;
//        fo.notingResults(14, "w_házRészei.csv", GameType.GERMAN_TO_HUN, "Sniff");
//    }

}