public  class Computer {

        protected String name;
        protected String kinds;
        protected double coreNum;
        protected double price;
        protected double volume;
    protected double speed;
        protected double price1;
    protected double price2;
    protected double price3;
    protected double price4;
        protected int len = 60;
        public Computer(){}
        public Computer (String name){
            this.name=name;
        }
//    public Computer (String kinds, double coreNum,double price1){
//        this.kinds = kinds;
//        this.coreNum=coreNum;
//        this.price1=price1;
//    }
//    public Computer (String kinds,double volume,double price){
//        this.kinds=kinds;
//        this.volume=volume;
//        this.price=price;
//    }

//        public Computer(String name, String kinds, double coreNum, double speed, double price1,double price2,double price3,double price4) {
//            this.kinds = kinds;
//            this.name = name;
//            this.price1 = price1;
//            this.price2 = price2;
//            this.price3 = price3;
//            this.price4 = price4;

 //       }

    /**
     *
     * @param name
     * @return
     */
        public String getName(String name){
            return "computer";
        }

    /**
     *
     * @param kinds
     * @param coreNum
     * @param price1
     */


        public void cpu(String kinds, double coreNum,double price1) {
            System.out.println(kinds + "   " + "coreNum" + coreNum + "   " + "price" + price1);
        }

        public void Memory(String kinds,double volume,double price2) {
            System.out.println(kinds + "   " + "volume" + volume + "   " + "price" + price2);
        }

        public void harddisk(String kinds, double volume, double price3) {
            System.out.println(kinds + "   " + "volume" + volume + "   " + "price" + price3);

        }

        public void board(String kinds, double speed, double price4) {
            System.out.println(kinds + "   " + "speed" + speed + "   " + "price" + price4);
        }

        public void ss(String name) {
            StringBuilder sb = new StringBuilder();
            String line;
            for (int i = 0; i < 60; i++) {
                sb.append("-");
            }
            sb.append("the computer name is:").append(name);
            line = sb.toString();
            System.out.println(line);
        }
        public void price(double price1,double price2,double price3,double price4){
            price=price1+price2+price3+price4;
            System.out.println("the price is:"+price);
        }
    }

