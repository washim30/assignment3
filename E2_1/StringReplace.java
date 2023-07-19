package E2_1;

public class StringReplace {
    private String stateName;
    public StringReplace(){
        stateName="Mississippi";
    }
    public StringReplace(String stateName){
        this.stateName= stateName;
    }

    public String  replaceI(){
       String name1= stateName.replace("i","ii");
        return name1;

    }
    public String replaceSS(){
        String name2=stateName.replace("ss","s");
        return name2;

    }

}
