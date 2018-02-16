public class PrintOrderTester {
    public static void main(String[] args) {
        PrintOrder test1 = new PrintOrder("greyscale","matte","single",1);
        test1.determineCostPerPage();
        test1.determineTotalCost();
        if (.15 != test1.getCostPerPage() || .15 !=test1.getTotalCost()){
            System.out.println("Failed test greyscale matte single 1");
        }

        PrintOrder test2 = new PrintOrder("greyscale","matte","single",2);
        test2.determineCostPerPage();
        test2.determineTotalCost();
        if (.15 != test2.getCostPerPage() || .3 !=test2.getTotalCost()){
            System.out.println("Failed test greyscale matte single 2");
        }

        PrintOrder test3 = new PrintOrder("greyscale","matte","double",2);
        test3.determineCostPerPage();
        test3.determineTotalCost();
        if (.25 != test3.getCostPerPage() || .5 !=test3.getTotalCost()){
            System.out.println("Failed test greyscale matte double 2");
        }

        PrintOrder test4 = new PrintOrder("greyscale","glossy","single",2);
        test4.determineCostPerPage();
        test4.determineTotalCost();
        if (.2 != test4.getCostPerPage() || .4 !=test4.getTotalCost()){
            System.out.println("Failed test greyscale glossy single 2");
        }

        PrintOrder test5 = new PrintOrder("P1","matte","single",2);
        test5.determineCostPerPage();
        test5.determineTotalCost();
        if (.35 != test5.getCostPerPage() || .7 !=test5.getTotalCost()){
            System.out.println("Failed test P1 matte single 2");
        }

        PrintOrder test6 = new PrintOrder("P2","matte","single",2);
        test6.determineCostPerPage();
        test6.determineTotalCost();
        if (.5 != test6.getCostPerPage() || 1.0 !=test6.getTotalCost()){
            System.out.println("Failed test P2 matte single 2");
        }

        PrintOrder test7 = new PrintOrder("P3","matte","single",2);
        test7.determineCostPerPage();
        test7.determineTotalCost();
        if (.7 != test7.getCostPerPage() || 1.4 !=test7.getTotalCost()){
            System.out.println("Failed test P3 matte single 2");
        }
    }
}