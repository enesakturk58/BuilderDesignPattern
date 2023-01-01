public class Main {
    public static void main(String[] args) {

        Personal personal1 = new Personal.Builder("Enes","Aktürk")
                .setAge(26).build();

        personal1.bilgileriGoster();

        /*Personal personal2 = new Personal.Builder().setName("Sevgi")
                .setSurName("Sancaktutan").setAge(24).setSex("Kadın").build();

        personal2.bilgileriGoster();*/




    }
}