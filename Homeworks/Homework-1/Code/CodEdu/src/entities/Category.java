package entities;

public class Category {
    private int id;
    private String name;

        public Category(String name) {
            this.name = name;
        }

        public int getId() {
            return id;
        }

        public void setId(int id) {
            this.id = id;
        }

        public String getName() {
            return name;
        }

        public void setName(String categoryName) {
            this.name = categoryName;
        }
}
