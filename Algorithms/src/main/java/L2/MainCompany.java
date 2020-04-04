package L2;

import java.util.List;

public class MainCompany{
    Company[] companies;

    public MainCompany(){
        int n = 7;
        companies = new Company[n];
        companies[0] = new Company(0, null);
        companies[1] = new Company(1,0);
        companies[2] = new Company(2,0);
        companies[3] = new Company(3,1);
        companies[4] = new Company(4,3);
        companies[5] = new Company(5,4);
        companies[6] = new Company(6,0);
    }
    public static void main(String[] args){

    }

    void fill(int n){
        if(n < 0) {
            return;
        }
        fill(n - 1);
        for(int i = 0; i < companies)
    }
}

class Company{
    Integer id;
    Integer parentId;
    List<Company> list;
    public Company(Integer id, Integer parentId){
        this.id = id;
        this.parentId = parentId;
    }
}
