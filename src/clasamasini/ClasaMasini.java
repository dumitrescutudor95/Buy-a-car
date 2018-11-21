package clasamasini;

import java.util.Scanner;

class Masina {

    private String marca = "marca";
    private String model = "model";
    private String culoare = "white";
    private String mata;
    private int pret = 0;
    private String vanduta;
    private static long profitulFirmei;
    private static int aA5 = 100, aA6 = 100, aA7 = 100, aQ6 = 100, aQ7 = 100; //modele ramase audi
    private static int bX1 = 100, bX2 = 100, bX3 = 100, bi3 = 100, bi9 = 100;//modele ramase bmw
    private static int mClasaA = 100, mClasaC = 100, mClasaE = 100, mSLC = 100, mClasaS = 100; //modele ramase mercedes

    public int getaA5() {
        return aA5;
    }

    public int getaA6() {
        return aA6;
    }

    public int getaA7() {
        return aA7;
    }

    public int getaQ6() {
        return aQ6;
    }

    public int getaQ7() {
        return aQ7;
    }

    public int getbX1() {
        return bX1;
    }

    public int getbX2() {
        return bX2;
    }

    public int getbX3() {
        return bX3;
    }

    public int getbi3() {
        return bi3;
    }

    public int getbi9() {
        return bi9;
    }

    public int getmClasaA() {
        return mClasaA;
    }

    public int getmClasaC() {
        return mClasaC;
    }

    public int getmClasaE() {
        return mClasaE;
    }

    public int getmSLC() {
        return mSLC;
    }

    public int getmClasaS() {
        return mClasaS;
    }

    Masina() {
        Scanner in = new Scanner(System.in);
        System.out.println("Va rugam sa introduceti specificatiile dorite.");
        System.out.println("Marci disponibile: \n\t(1)   Audi \n\t(2)   BMW\n\t(3)   Mercedes");
        System.out.print("Marca dorita(introduceti numarul):");
        marca = in.next();
        //audi
        switch (marca) {
            case "1": //audi 
                System.out.println("");
                System.out.println("Modele valabile: \n \t(1)   A5 14000E \n\t(2)   A6 15000E \n\t(3)   A7 28000E \n\t(4)   Q6 27000E \n \t(5)   Q7 40.000E");

                System.out.print("Model dorit(introduceti numarul) : ");
                model = in.next();
                switch (model) {

                    case "1":

                        pret += 14000;
                        System.out.println("");
                        System.out.println("Ati ales Audi A5.Pret:" + pret + " euro.");
                        aA5--;
                        break;
                    case "2":
                       ;
                        pret += 15000;
                        System.out.println("");
                        System.out.println("Ati ales Audi A6.Pret:" + pret + " euro.");
                        aA6--;
                        break;
                    case "3":
                        pret += 28000;
                        System.out.println("");
                        System.out.println("Ati ales Audi A7.Pret:" + pret + " euro.");
                        aA7--;
                        break;
                    case "4":
                        pret += 27000;
                        System.out.println("");
                        System.out.println("Ati ales Audi Q6.Pret:" + pret + " euro.");
                        aQ6--;
                        break;
                    case "5":
                        pret += 40000;
                        System.out.println("");
                        System.out.println("Ati ales Audi Q7.Pret:" + pret + " euro.");
                        aQ7--;
                        break;
                    default:
                        System.out.println("Invalid number");
                        throw new java.lang.Error("INVALID");
                }

                break;
            case "2"://bmw
                System.out.println("");
                System.out.println("Modele valabile: \n \t(1)   X1 20000E \n\t(2)   X2 40000E \n\t(3)   X3 60000E \n\t(4)   i3 38.000E \n \t(5)   i9 Coupe 142.000E");
                System.out.print("Model dorit(introduceti numarul) :");
                model = in.next();
                switch (model) {
                    case "1":
                        pret += 20000;
                        System.out.println("");
                        System.out.println("Ati ales Bmw X1.Pret:" + pret + " euro.");
                        bX1--;
                        break;
                    case "2":
                        pret += 40000;
                        System.out.println("");
                        System.out.println("Ati ales Bmw X2.Pret:" + pret + " euro.");
                        bX2--;
                        break;
                    case "3":
                        pret += 60000;
                        System.out.println("");
                        System.out.println("Ati ales Bmw X3.Pret:" + pret + " euro.");
                        bX3--;
                        break;
                    case "4":
                        pret += 38000;
                        System.out.println("");
                        System.out.println("Ati ales Bmw i3.Pret:" + pret + " euro.");
                        bi3--;
                        break;
                    case "5":
                        pret += 140000;
                        System.out.println("");
                        System.out.println("Ati ales Bmw i9 Coupe.Pret:" + pret + " euro.");
                        bi9--;
                        break;
                    default:
                        System.out.println("Invalid number");
                        throw new java.lang.Error("INVALID");

                }
                break;

            case "3": //mercedes
                System.out.println("");

                System.out.println("Modele valabile: \n \t(1)   Clasa A 4000E \n\t(2)    Clasa C 5000E \n\t(3)    Clasa E Limuzina 8000E \n\t(4)    SLC Roadster 37.000E \n \t(5)    Clasa S Cabriolet 130.000E");
                System.out.print("Model dorit(introduceti numarul) :");
                model = in.next();
                switch (model) {
                    case "1":
                        pret += 4000;
                        System.out.println("");
                        System.out.println("Ati ales Mercedes Clasa A.Pret:" + pret + " euro.");
                        mClasaA--;
                        break;
                    case "2":
                        pret += 5000;
                        System.out.println("");
                        System.out.println("Ati ales Mercedes Clasa C.Pret:" + pret + " euro.");
                        mClasaC--;
                        break;
                    case "3":
                        pret += 8000;
                        System.out.println("");
                        System.out.println("Ati ales Mercedes Clasa E Limuzina.Pret:" + pret + " euro.");
                        mClasaE--;
                        break;
                    case "4":
                        pret += 37000;
                        System.out.println("");
                        System.out.println("Ati ales Mercedes Clasa SLC Roadster.Pret:" + pret + " euro.");
                        mSLC--;
                        break;
                    case "5":
                        pret += 130000;
                        System.out.println("");
                        System.out.println("Ati ales Mercedes Clasa S Cabriolet.Pret:" + pret + " euro.");
                        mClasaS--;
                        break;
                    default:
                        System.out.println("Invalid number");
                        throw new java.lang.Error("INVALID");
                }
                break;

            default:
                System.out.println("Invalid number");
                throw new java.lang.Error("INVALID");

        }
        System.out.println("");
        System.out.println("");
        System.out.println("Masina va iesi din fabrica culoarea alba.\nVopsirea acesteia costa 1500E");
        System.out.println("Culori disponibile: \n\t(1)   Negru \n\t(2)   Albastru \n\t(3)   Rosu \n\t(4)   Maro \n\t(5)   Visinie");
        System.out.println("Culoarea dorita(Introduceti numarul.Daca nu doriti vopsire,apasati 0) ");
        culoare = in.next();
        switch (culoare) {
            case "0":
                System.out.println("");
                System.out.println("Ati ales culoarea alba.Pret total:" + pret + " euro.");
                break;
            case "1":
                pret += 1500;
                System.out.println("");
                System.out.println("Ati ales culoarea Negru.Pret total:" + pret + " euro.");

                break;
            case "2":
                pret += 1500;
                System.out.println("");
                System.out.println("Ati ales culoarea Albastra.Pret total:" + pret + " euro.");
                ;
                break;
            case "3":
                pret += 1500;
                System.out.println("");
                System.out.println("Ati ales culoarea Rosie.Pret total:" + pret + " euro.");
                ;
                break;
            case "4":
                pret += 1500;
                System.out.println("");
                System.out.println("Ati ales culoarea Maro.Pret total:" + pret + " euro.");
                ;
                break;
            case "5":
                System.out.println("");
                pret += 1500;
                System.out.println("Ati ales culoarea Visinie.Pret total:" + pret + " euro.");
                break;
            default:
                System.out.println("Invalid number");
                throw new java.lang.Error("INVALID");

        }

        System.out.println("Pentru inca 1000E,doriti sa fie mata?");
        System.out.println("\t(1)   Da \n\t(2)   Nu");
        System.out.print("Introduceti nuamrul: ");
        mata = in.next();
        switch (mata) {
            case "1":
                System.out.println("");
                System.out.println("Ati ales lucios.Pret total:" + pret + " euro.");
                break;

            case "2":
                System.out.println("");
                pret += 1000;
                System.out.println("Ati ales mat.Pret total:" + pret + " euro.");
                break;
            default:
                System.out.println("Invalid number");
                throw new java.lang.Error("INVALID");

        }
        System.out.println("");
        System.out.println("");
        System.out.println("");

    }

    public void efectuareTranzactie() {
        Scanner in = new Scanner(System.in);
        System.out.println("\t Pret total:" + pret + " euro. \n\t Doriti sa efectuati tranzactia? \n\t (1) DA  (2)  NU");
        vanduta = in.next();
        switch (vanduta) {
            case "1":
                System.out.println("");
                System.out.println("Felicitari! Ati achizitionat masina.");
                profitulFirmei += pret;
                System.out.println("");
                System.out.println("");
                break;
            case "2":
                System.out.println("");
                System.out.println("Masina nu a fost achizitionata.");
                //iar pe baza acestui caz,ma gandesc ca poate fi folosit destructorul intr o alta functie,dar nu stiu inca cum (presupun ca inca de aici din constructor nu se poate distruge obiectul)
                break;
            default:
                System.out.println("Invalid number");
                throw new java.lang.Error("INVALID");
        }
    }

    public void afisareStoc() {
        System.out.println("MAI SUNT DISPONIBILE:");
        System.out.println("----------------------------------");
        System.out.println("----------------------------------");
        System.out.println("Audi A5:" + getaA5() + "  |  Audi A6:" + getaA6() + "  |  Audi Q7:" + getaQ7());

        System.out.println("  |  zAudi A7:" + getaA7() + "  |  Audi Q6:" + getaQ6());

        System.out.println("----------------------------------");
        System.out.println("----------------------------------");
        System.out.println("BMW X1:" + getbX1() + "  |  BMW X2" + getbX2() + "  |  BMW i9:" + getbi9());
        System.out.println("BMW X3" + getbX3() + "  |  BMW i3:" + getbi3());

        System.out.println("----------------------------------");
        System.out.println("----------------------------------");
        System.out.println("Mercedes Clasa A:" + getmClasaA() + "  |  Mercedes  Clasa C:" + getmClasaC() + "  |  Mercedes Clasa S:" + getmClasaS());
        System.out.println("Mercedes  Clasa E:" + getmClasaE() + "  |  Mercedes  SLC:" + getmSLC());

    }
}

public class ClasaMasini {

    public static void main(String[] args) {

        Masina m1 = new Masina();
        m1.efectuareTranzactie();
        m1.afisareStoc();

    }

}
