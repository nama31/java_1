abstract public class Employe {
    String name;
    int id;
    int baseSalary;
    public Employe(String name,int id , int baseSalary){
        this.name = name;
        this.id = id;
        this.baseSalary = baseSalary;
    }
    abstract public double calculateSalary(int x);
    public void gerSalary(){
        System.out.println(calculateSalary(baseSalary));
    }
}

class FullTimeEmploye extends Employe{
    public FullTimeEmploye(String name,int id, int baseSalary){
        super(name,id,baseSalary);

}
public double calculateSalary(int x){
        double y = x*1.2;
        return y;
}



        }

class ContractEmploye extends Employe {
    public ContractEmploye(String name, int id, int baseSalary) {
        super(name, id, baseSalary);

    }

    @Override
    public double calculateSalary(int x) {
        return baseSalary;
    }

}

class MainEmploye{
    public static void main(String[] args) {
        Employe[] sfera = new Employe[2];
        sfera[0] = new FullTimeEmploye("aman",1,3000);
        sfera[1] = new ContractEmploye("nama",2,1000);
        sfera[0].gerSalary();

    }
}