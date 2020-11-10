package Program;

import Entities.DanhBa;
import Method.DanhBaManager;

public class Menu {

    public void menu1(DanhBaManager danhBaManager){
        Input input= new Input();
        DanhBa danhBa = input.inputDanhBa();
        danhBaManager.add(danhBa);
    }

    public void menu2(DanhBaManager danhBaManager){
        danhBaManager.displayALL();
    }

    public void menu3(DanhBaManager danhBaManager){
        danhBaManager.update();
    }

    public void menu4(DanhBaManager danhBaManager) {
        danhBaManager.delete();
    }

    public void menu5(DanhBaManager danhBaManager) {
        danhBaManager.find();

    }
}
