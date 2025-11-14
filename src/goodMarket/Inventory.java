package goodmarket;

import java.time.LocalDate;
import java.util.HashMap;
import java.util.Map;

public class Inventory {

    private static final LocalDate DEFAULT_PICKING_DATE = LocalDate.now();
    private static final int DEFAULT_SHELF_LIFE_DAYS = 7;
    public Map<Integer, Product> stock;
    // id -> Product
    public static final Map<Integer, Product> INITIAL_STOCK = Map.ofEntries(
            Map.entry(1,  new Fruit("Clémentine",        2.90, "kg",    6,  DEFAULT_PICKING_DATE, DEFAULT_SHELF_LIFE_DAYS)),
            Map.entry(2,  new Fruit("Datte",             7.00, "kg",    4,  DEFAULT_PICKING_DATE, DEFAULT_SHELF_LIFE_DAYS)),
            Map.entry(3,  new Fruit("Grenade",           3.50, "kg",    3,  DEFAULT_PICKING_DATE, DEFAULT_SHELF_LIFE_DAYS)),
            Map.entry(4,  new Fruit("Kaki",              4.50, "kg",    3,  DEFAULT_PICKING_DATE, DEFAULT_SHELF_LIFE_DAYS)),
            Map.entry(5,  new Fruit("Kiwi",              3.50, "kg",    5,  DEFAULT_PICKING_DATE, DEFAULT_SHELF_LIFE_DAYS)),
            Map.entry(6,  new Fruit("Mandarine",         2.80, "kg",    6,  DEFAULT_PICKING_DATE, DEFAULT_SHELF_LIFE_DAYS)),
            Map.entry(7,  new Fruit("Orange",            1.50, "kg",    8,  DEFAULT_PICKING_DATE, DEFAULT_SHELF_LIFE_DAYS)),
            Map.entry(8,  new Fruit("Pamplemousse",      2.00, "pièce", 8,  DEFAULT_PICKING_DATE, DEFAULT_SHELF_LIFE_DAYS)),
            Map.entry(9,  new Fruit("Poire",             2.50, "kg",    5,  DEFAULT_PICKING_DATE, DEFAULT_SHELF_LIFE_DAYS)),
            Map.entry(10, new Fruit("Pomme",             1.50, "kg",    8,  DEFAULT_PICKING_DATE, DEFAULT_SHELF_LIFE_DAYS)),
            Map.entry(11, new Vegetable("Carotte",           1.30, "kg",    7,  DEFAULT_PICKING_DATE, DEFAULT_SHELF_LIFE_DAYS)),
            Map.entry(12, new Vegetable("Choux de Bruxelles",4.00, "kg",    4,  DEFAULT_PICKING_DATE, DEFAULT_SHELF_LIFE_DAYS)),
            Map.entry(13, new Vegetable("Chou vert",         2.50, "pièce",12,  DEFAULT_PICKING_DATE, DEFAULT_SHELF_LIFE_DAYS)),
            Map.entry(14, new Vegetable("Courge butternut",  2.50, "pièce", 6,  DEFAULT_PICKING_DATE, DEFAULT_SHELF_LIFE_DAYS)),
            Map.entry(15, new Vegetable("Endive",            2.50, "kg",    5,  DEFAULT_PICKING_DATE, DEFAULT_SHELF_LIFE_DAYS)),
            Map.entry(16, new Vegetable("Épinard",           2.60, "kg",    4,  DEFAULT_PICKING_DATE, DEFAULT_SHELF_LIFE_DAYS)),
            Map.entry(17, new Vegetable("Poireau",           1.20, "kg",    5,  DEFAULT_PICKING_DATE, DEFAULT_SHELF_LIFE_DAYS)),
            Map.entry(18, new Vegetable("Potiron",           2.50, "pièce", 6,  DEFAULT_PICKING_DATE, DEFAULT_SHELF_LIFE_DAYS)),
            Map.entry(19, new Vegetable("Radis noir",        5.00, "pièce",10,  DEFAULT_PICKING_DATE, DEFAULT_SHELF_LIFE_DAYS)),
            Map.entry(20, new Vegetable("Salsifis",          2.50, "kg",    3,  DEFAULT_PICKING_DATE, DEFAULT_SHELF_LIFE_DAYS))
    );
    public Inventory(){
        this.stock = new HashMap<>(INITIAL_STOCK);
    }

    public String printInventory() {
        StringBuilder sb = new StringBuilder();

        sb.append(String.format(
                "%-4s %-20s %10s %-8s %10s %-12s %12s%n",
                "ID", "Name", "Price", "Unit", "Quantity", "Picking date", "Shelf life"
        ));
        sb.append("-------------------------------------------------------------------------\n");


        for (Map.Entry<Integer, Product> entry : this.stock.entrySet()) {
            Integer id = entry.getKey();
            Product product = entry.getValue();

            sb.append(String.format(
                    "%-4d %-20s %10.2f %-8s %10.2f %-12s %10d days%n",
                    id,
                    product.getName(),
                    product.getUnitPrice(),
                    product.getUnit(),
                    product.getStockQuantity(),
                    product.getPickingDate(),
                    product.getShelfLifeDays()
            ));
        }

        return sb.toString();
    }

}
