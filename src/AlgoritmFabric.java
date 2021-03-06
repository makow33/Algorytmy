import Algorithms.*;
import PowtorzenieWiadomosci4_08.Zad1Dupilkat;
import PowtorzenieWiadomosci4_08.Zad2_Arrayslist;

/**
 * Created by RENT on 2017-07-21.
 */
public class AlgoritmFabric {
    public AbstractAlgoritm getAlgoritm(String name) throws Exception {

        switch (name.toLowerCase()) {
            case "test":
                return new Test();
            case "biednycamelcase":
                return new BiednyCamelCase();
            case "sumowanieliczbnaturalnych":
                return new SumowanieLiczbNaturalnych();
            case "sumofnumbers":
                return new SumOfNumbers();
            case "cash":
                return new Cash();
            case "rokprzystepny":
                return new RokPrzystepny();
            case "silnia":
                return new Silnia();
            case "silnialiczbna":
                return new SilniaLiczbNa();
            case "operajanasilni":
                return new OperacjaNaSilni();
            case "ciagfibonacciego":
                return new CiagFibonacciego();
            case "spacjacamelcase":
                return new SpacjaCamelCase();
            case "syfrcezara":
                return new SzyfrCezara();
            case "algorytmbabelkowy":
                return new AlgorytmBabelkowy();
            case "sorowaniewzgledempunktu":
                return new SortowanieWzgledemPunktu();
            case "sortowanieprzezzliczanie":
                return new SortowaniePrzezZliczanie();
            case "krzyzowka":
                return new Krzyzowka();
            case "najwiekszywspolnydzielnik":
                return new NajwiekszyWspolnyDzielnik();
            case "generatorplanszywarcaby":
                return new GeneratorPlanszyWarcaby();
            case "domianta":
                return new Dominanta();
            case "wyznaczaniedatywielkanocy":
                return new WyznaczanieDatyWielkanocy();
            case "tablice":
                return new Tablice();
            case "algmaxminwart":
                return new AlgorytmWyszukiwanieMaxMinWartosci();
            case "algwyszykiwanielidera":
                return new AlgWyszykiwanieLidera();
            case "testowanielisty":
                return new TestowanieListy();
            case "listyzad":
                return new ListyZad();
            case "prostedrzewo":
                return new Drzewo();
            case "kopiec":
                return new TestowanieKopca();
            case "przeliczaniesys":
                return new PrzeliczanieSystemow();
            case "odwrotnanotacjapolska":
                return new OdwrotnaNotacjaPolska();
            case "zad1duplikat":
                return new Zad1Dupilkat();
            case "zad2arraylist":
                return new Zad2_Arrayslist();
            case "nwd":
                return new nwd();
            case "nww":
                return new Nww();
            default:
                throw new Exception("Nie ma takiego algorytmu");
        }
    }
}
