package com.company;

    public record Jemstone (String name, float number_of_carats, float price,
                            float density, String color, String opacity) {

        public static String shape = "square";

        public Jemstone() {
            this("unknown",0,0,0,"unknown", "unknown");
        }

        public Jemstone(String name, float number_of_carats, float price) {
            this(name, number_of_carats, price, 0, "unknown", "unknown");

        }

        public Jemstone(String name, float number_of_carats, float price,
                        float density, String color, String opacity) {
            this.name = name;
            this.number_of_carats = number_of_carats;
            this.price = price;
            this.density = density;
            this.color = color;
            this.opacity = opacity;
        }

        @Override
        public String toString() { //function returns information about jemstones
            return "Name of jemstone: " + name + "," + " number of carats: " + number_of_carats + ","
                    + " price: " + price + "," + " density: " + density + "," + " color: " + color + ","
                    + " opacity: " + opacity + ".";
        }

        public static String returnShape() { // function returns shape of jemstones
            return "The shape of jemstones is: " + shape + ".";
        }
    }

