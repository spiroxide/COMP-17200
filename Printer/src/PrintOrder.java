public class PrintOrder {
    private String color, paperType, sided;
    private int numPages;

    private double costPerPage, totalCost;

    public PrintOrder(String color, String paperType, String sided, int numPages) {
        this.color = color;
        this.paperType = paperType;
        this.sided = sided;
        this.numPages = numPages;

        costPerPage = -1;
        totalCost = -1;
    }

    private double colorCost() {
        if (color.equals("greyscale")) {
            return .1;
        }
        else if (color.equals("P1")) {
            return .3;
        }
        else if (color.equals("P2")) {
            return .45;
        }
        else if (color.equals("P3")) {
            return .65;
        }
        return -1;
    }

    private double sidedCost() {
        if (sided.equals("single")) {
            return 1;
        }
        else if (sided.equals("double")) {
            return 2;
        }
        return -1;
    }

    private double pageCost() {
        if (paperType.equals("matte")) {
            return .05;
        }
        else if (paperType.equals("glossy")) {
            return .1;
        }
        return -1;
    }

    public double determineCostPerPage() {
        costPerPage = Math.round((colorCost() * sidedCost() + pageCost()) * 100) / 100.0;
        return costPerPage;
    }

    public double determineTotalCost() {
        totalCost = Math.round(((colorCost() * sidedCost() + pageCost()) * numPages) * 100) / 100.0;
        return totalCost;
    }

    public double getCostPerPage() {
        return costPerPage;
    }

    public double getTotalCost() {
        return totalCost;
    }
}
