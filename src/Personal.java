public class Personal {
    private String name;
    private String surName;
    private int age;
    private String sex;

    private Personal(Builder builder){
        this.name=builder.name;
        this.surName=builder.surName;
        this.age=builder.age;
        this.sex=builder.sex;
    }
    public String getName() {
        return name;
    }

    public String getSurName() {
        return surName;
    }

    public int getAge() {
        return age;
    }

    public String getSex() {
        return sex;
    }
    public void bilgileriGoster(){
        System.out.println("Personel ad : " + getName());
        System.out.println("Personel soyad : " + getSurName());
        System.out.println("Personel yaş : " + getAge());
        System.out.println("Personel cinsiyet : " + getSex());
    }

    public static class Builder{
        private String name;
        private String surName;
        private int age;
        private String sex;

        public Builder(String name,String surName){
            this.name=name;
            this.surName=surName;
        }
        public Builder(){}

        public Builder setName(String name) {
            this.name = name;
            return this;
        }

        public Builder setSurName(String surName) {
            this.surName = surName;
            return this;
        }

        public Builder setAge(int age) {
            this.age = age;
            return this;
        }
        public Builder setSex(String isSex){
            this.sex=isSex;
            return this;
        }
        public Personal build(){
            return new Personal(this);
        }
    }



}
