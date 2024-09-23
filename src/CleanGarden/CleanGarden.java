package CleanGarden;

public class CleanGarden {
    public static void main(String[] args) {
        char[][] gardenTest = new char[][]{{ '_','@','@','@' }, { '_','_','_','@' }, { '_','_','@', '_' }};
        System.out.println(crap(gardenTest,2,2));
    }

    public static String crap(char[][] garden, int bags, int cap) {
        int crapCount = 0;
        for (int i = 0; i < garden.length; i++) {
            for(int j = 0; j < garden[i].length; j++) {
                if (garden[i][j] == 'D') {
                    return "Dog!!";
                }
                if(garden[i][j] == '@') {
                    crapCount++;
                }
            }
        }
        if(crapCount > bags * cap){
            return "Cr@p";
        }else {
            return "Clean";
        }
    }
}
