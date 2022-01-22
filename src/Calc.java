import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;

public class Calc
{
    public static void main(String[] args){
        int ap=6;
        int results=116;
        boolean tet=true;
        try{
            if(args.length>0){
                ap=Integer.parseInt(args[0]);
            }
            if(args.length>1){
                results=Integer.parseInt(args[1]);
            }
            if(args.length>2){
                tet=args[2].equals("false");
            }
        }catch(Exception e){
            System.out.println("You've done something wrong: " + e);
        }
        new Calc(ap,results,tet);
    }

    public Calc(int ap, int results, boolean tet){
        Object[][] earrings;
        Object[][] necklace;
        Object[][] rings;
        Object[][] belt;
        if(tet){
            earrings=new Object[][]{

                {"tungrade-ohrring",7,88},
                {"PRI: tungrade-ohrring",9,195},
                {"DUO: tungrade-ohrring",11,583},
                {"TRI: tungrade-ohrring",13,1618},

                {"blauwahlzan-ohrring",5,33},
                {"PRI: blauwahlzan-ohrring",7,85},
                {"DUO: blauwahlzan-ohrring",9,254},
                {"TRI: blauwahlzan-ohrring",11,706},

                {"hexenohrring",5,8},
                {"PRI: hexenohrring",7,20},
                {"DUO: hexenohrring",9,71},
                {"TRI: hexenohrring",11,226},
                {"TET: hexenohrring",13,516},

                {"ohrring des flüchtigen khalk",5,38},
                {"PRI: ohrring des flüchtigen khalk",7,110},
                {"DUO: ohrring des flüchtigen khalk",9,330},
                {"TRI: ohrring des flüchtigen khalk",11,915},

                {"blauer korallenohrring",4,2},
                {"PRI: blauer korallenohrring",6,5},
                {"DUO: blauer korallenohrring",8,17},
                {"TRI: blauer korallenohrring",10,54},
                {"TET: blauer korallenohrring",12,124},

                {"mesto-ohrring",4,2},
                {"PRI: mesto-ohrring",5,3},
                {"DUO: mesto-ohrring",6,13},
                {"TRI: mesto-ohrring",7,40},

                {"roter korallenohrring",2,4},
                {"PRI: roter korallenohrring",4,10},
                {"DUO: roter korallenohrring",6,37},
                {"TRI: roter korallenohrring",8,117},
                {"TET: roter korallenohrring",10,268},

                {"baris-ohrring",2,0},
                {"PRI: baris-ohrring",3,0},
                {"DUO: baris-ohrring",4,1},
                {"TRI: baris-ohrring",5,2},
                {"TET: baris-ohrring",6,4},
            };
            necklace=new Object[][]{

                {"laytenns kraftstein",10,95},

                {"ogerring",10,95},
                {"PRI: ogerring",15,285},
                {"DUO: ogerring",20,855},
                {"TRI: ogerring",25,2375},

                {"serap-halskette",8,41},
                {"PRI: serap-halskette",12,110},
                {"DUO: serap-halskette",16,328},
                {"TRI: serap-halskette",20,912},

                {"sicils halskette",7,33},
                {"PRI: sicils halskette",10,76},
                {"DUO: sicils halskette",13,228},
                {"TRI: sicils halskette",16,632},

                {"halskette von shultz dem gladiator",7,8},
                {"PRI: halskette von shultz dem gladiator",10,17},
                {"DUO: halskette von shultz dem gladiator",13,64},
                {"TRI: halskette von shultz dem gladiator",16,202},

                {"manos-diamanthalskette",6,25},
                {"PRI: manos-diamanthalskette",9,75},
                {"DUO: manos-diamanthalskette",12,275},
                {"TRI: manos-diamanthalskette",15,874},

                {"manos-rubinhalskette",6,25},
                {"PRI: manos-rubinhalskette",9,75},
                {"DUO: manos-rubinhalskette",12,274},
                {"TRI: manos-rubinhalskette",15,873},
                {"TET: manos-rubinhalskette",18,1995},

                {"manos-saphirhalskette",6,23},
                {"PRI: manos-saphirhalskette",9,75},
                {"DUO: manos-saphirhalskette",12,274},

                {"manos-smaragdhalskette",6,25},
                {"PRI: manos-smaragdhalskette",9,75},
                {"DUO: manos-smaragdhalskette",12,275},
                {"TRI: manos-smaragdhalskette",15,873},

                {"manos-topashalskette",6,25},
                {"PRI: manos-topashalskette",9,75},
                {"DUO: manos-topashalskette",12,275},
                {"TRI: manos-topashalskette",15,873},
                {"TET: manos-topashalskette",18,1995},

                {"halskette der guten taten",6,10},
                {"PRI: halskette der guten taten",8,25},
                {"DUO: halskette der guten taten",10,91},
                {"TRI: halskette der guten taten",12,288},

                {"siegel eines uralten wächters",6,7},
                {"PRI: siegel eines uralten wächters",8,17},
                {"DUO: siegel eines uralten wächters",10,60},
                {"TRI: siegel eines uralten wächters",12,192},

                {"diamanthalskette der tapferkeit",5,1},

                {"scarla-halskette",5,2},
                {"PRI: scarla-halskette",6,6},
                {"DUO: scarla-halskette",7,20},
                {"TRI: scarla-halskette",8,63},

                {"baris-halskette",4,0},
                {"PRI: baris-halskette",6,0},
                {"DUO: baris-halskette",8,1},
                {"TRI: baris-halskette",10,2},
                {"TET: baris-halskette",12,5}
            };
            rings=new Object[][]{

                {"ring des halbmondwächters",5,42},
                {"PRI: ring des halbmondwächters",8,98},
                {"DUO: ring des halbmondwächters",11,294},
                {"TRI: ring des halbmondwächters",14,817},
                {"TET: ring des halbmondwächters",17,2616},

                {"blauer korallenring",5,1},
                {"PRI: blauer korallenring",6,2},
                {"DUO: blauer korallenring",7,6},
                {"TRI: blauer korallenring",8,20},
                {"TET: blauer korallenring",9,45},

                {"schattenmal",5,7},
                {"PRI: schattenmal",7,17},
                {"DUO: schattenmal",9,60},
                {"TRI: schattenmal",11,192},
                {"TET: schattenmal",13,439},

                {"roter korallenring",4,1},
                {"PRI: roter korallenring",5,1},
                {"DUO: roter korallenring",6,5},
                {"TRI: roter korallenring",7,15},
                {"TET: roter korallenring",8,34},

                {"ring der gesetzlosen",3,0},
                {"PRI: ring der gesetzlosen",4,1},
                {"DUO: ring der gesetzlosen",5,3},
                {"TRI: ring der gesetzlosen",6,8},
                {"TET: ring der gesetzlosen",7,18},

                {"baris-ring",2,0},
                {"PRI: baris-ring",3,0},
                {"DUO: baris-ring",4,1},
                {"TRI: baris-ring",5,2},
                {"TET: baris-ring",6,4},

                {"ring der guten taten",2,0},
                {"PRI: ring der guten taten",3,0},
                {"DUO: ring der guten taten",4,1},
                {"TRI: ring der guten taten",5,3},
                {"TET: ring der guten taten",6,7}
            };
            belt=new Object[][]{

                {"gürtel des basilisken",5,58},
                {"PRI: gürtel des basilisken",8,134},
                {"DUO: gürtel des basilisken",11,401},
                {"TRI: gürtel des basilisken",14,1113},

                {"baumgeistgürtel",5,32},
                {"PRI: baumgeistgürtel",7,77},
                {"DUO: baumgeistgürtel",9,231},
                {"TRI: baumgeistgürtel",11,641},

                {"antiker waffenkern",4,5},
                {"PRI: antiker waffenkern",5,12},
                {"DUO: antiker waffenkern",6,45},
                {"TRI: antiker waffenkern",7,143},

                {"gürtel von shultz dem gladiator",3,1},
                {"PRI: gürtel von shultz dem gladiator",5,4},
                {"DUO: gürtel von shultz dem gladiator",7,13},
                {"TRI: gürtel von shultz dem gladiator",9,42},
                {"TET: gürtel von shultz dem gladiator",11,97},

                {"baris-gürtel",2,0},
                {"PRI: baris-gürtel",3,0},
                {"DUO: baris-gürtel",4,1},
                {"TRI: baris-gürtel",5,2},
                {"TET: baris-gürtel",6,4}
            };
        }else{
            earrings=new Object[][]{

                {"tungrade-ohrring",7,88},
                {"PRI: tungrade-ohrring",9,195},
                {"DUO: tungrade-ohrring",11,583},
                {"TRI: tungrade-ohrring",13,1618},

                {"blauwahlzan-ohrring",5,33},
                {"PRI: blauwahlzan-ohrring",7,85},
                {"DUO: blauwahlzan-ohrring",9,254},
                {"TRI: blauwahlzan-ohrring",11,706},

                {"hexenohrring",5,8},
                {"PRI: hexenohrring",7,20},
                {"DUO: hexenohrring",9,71},
                {"TRI: hexenohrring",11,226},
                //{"TET: hexenohrring",13,516},

                {"ohrring des flüchtigen khalk",5,38},
                {"PRI: ohrring des flüchtigen khalk",7,110},
                {"DUO: ohrring des flüchtigen khalk",9,330},
                {"TRI: ohrring des flüchtigen khalk",11,915},

                {"blauer korallenohrring",4,2},
                {"PRI: blauer korallenohrring",6,5},
                {"DUO: blauer korallenohrring",8,17},
                {"TRI: blauer korallenohrring",10,54},
                //{"TET: blauer korallenohrring",12,124},

                {"mesto-ohrring",4,2},
                {"PRI: mesto-ohrring",5,3},
                {"DUO: mesto-ohrring",6,13},
                {"TRI: mesto-ohrring",7,40},

                {"roter korallenohrring",2,4},
                {"PRI: roter korallenohrring",4,10},
                {"DUO: roter korallenohrring",6,37},
                {"TRI: roter korallenohrring",8,117},
                //{"TET: roter korallenohrring",10,268},

                {"baris-ohrring",2,0},
                {"PRI: baris-ohrring",3,0},
                {"DUO: baris-ohrring",4,1},
                {"TRI: baris-ohrring",5,2},
                //{"TET: baris-ohrring",6,4},
            };
            necklace=new Object[][]{

                {"laytenns kraftstein",10,95},

                {"ogerring",10,95},
                {"PRI: ogerring",15,285},
                {"DUO: ogerring",20,855},
                {"TRI: ogerring",25,2375},

                {"serap-halskette",8,41},
                {"PRI: serap-halskette",12,110},
                {"DUO: serap-halskette",16,328},
                {"TRI: serap-halskette",20,912},

                {"sicils halskette",7,33},
                {"PRI: sicils halskette",10,76},
                {"DUO: sicils halskette",13,228},
                {"TRI: sicils halskette",16,632},

                {"halskette von shultz dem gladiator",7,8},
                {"PRI: halskette von shultz dem gladiator",10,17},
                {"DUO: halskette von shultz dem gladiator",13,64},
                {"TRI: halskette von shultz dem gladiator",16,202},

                {"manos-diamanthalskette",6,25},
                {"PRI: manos-diamanthalskette",9,75},
                {"DUO: manos-diamanthalskette",12,275},
                {"TRI: manos-diamanthalskette",15,874},

                {"manos-rubinhalskette",6,25},
                {"PRI: manos-rubinhalskette",9,75},
                {"DUO: manos-rubinhalskette",12,274},
                {"TRI: manos-rubinhalskette",15,873},
                //{"TET: manos-rubinhalskette",18,1995},

                {"manos-saphirhalskette",6,23},
                {"PRI: manos-saphirhalskette",9,75},
                {"DUO: manos-saphirhalskette",12,274},

                {"manos-smaragdhalskette",6,25},
                {"PRI: manos-smaragdhalskette",9,75},
                {"DUO: manos-smaragdhalskette",12,275},
                {"TRI: manos-smaragdhalskette",15,873},

                {"manos-topashalskette",6,25},
                {"PRI: manos-topashalskette",9,75},
                {"DUO: manos-topashalskette",12,275},
                {"TRI: manos-topashalskette",15,873},
                //{"TET: manos-topashalskette",18,1995},

                {"halskette der guten taten",6,10},
                {"PRI: halskette der guten taten",8,25},
                {"DUO: halskette der guten taten",10,91},
                {"TRI: halskette der guten taten",12,288},

                {"siegel eines uralten wächters",6,7},
                {"PRI: siegel eines uralten wächters",8,17},
                {"DUO: siegel eines uralten wächters",10,60},
                {"TRI: siegel eines uralten wächters",12,192},

                {"diamanthalskette der tapferkeit",5,1},

                {"scarla-halskette",5,2},
                {"PRI: scarla-halskette",6,6},
                {"DUO: scarla-halskette",7,20},
                {"TRI: scarla-halskette",8,63},

                {"baris-halskette",4,0},
                {"PRI: baris-halskette",6,0},
                {"DUO: baris-halskette",8,1},
                {"TRI: baris-halskette",10,2},
                //{"TET: baris-halskette",12,5}
            };
            rings=new Object[][]{

                {"ring des halbmondwächters",5,42},
                {"PRI: ring des halbmondwächters",8,98},
                {"DUO: ring des halbmondwächters",11,294},
                {"TRI: ring des halbmondwächters",14,817},
                //{"TET: ring des halbmondwächters",17,2616},

                {"blauer korallenring",5,1},
                {"PRI: blauer korallenring",6,2},
                {"DUO: blauer korallenring",7,6},
                {"TRI: blauer korallenring",8,20},
                //{"TET: blauer korallenring",9,45},

                {"schattenmal",5,7},
                {"PRI: schattenmal",7,17},
                {"DUO: schattenmal",9,60},
                {"TRI: schattenmal",11,192},
                //{"TET: schattenmal",13,439},

                {"roter korallenring",4,1},
                {"PRI: roter korallenring",5,1},
                {"DUO: roter korallenring",6,5},
                {"TRI: roter korallenring",7,15},
                //{"TET: roter korallenring",8,34},

                {"ring der gesetzlosen",3,0},
                {"PRI: ring der gesetzlosen",4,1},
                {"DUO: ring der gesetzlosen",5,3},
                {"TRI: ring der gesetzlosen",6,8},
                //{"TET: ring der gesetzlosen",7,18},

                {"baris-ring",2,0},
                {"PRI: baris-ring",3,0},
                {"DUO: baris-ring",4,1},
                {"TRI: baris-ring",5,2},
                //{"TET: baris-ring",6,4},

                {"ring der guten taten",2,0},
                {"PRI: ring der guten taten",3,0},
                {"DUO: ring der guten taten",4,1},
                {"TRI: ring der guten taten",5,3},
                //{"TET: ring der guten taten",6,7}
            };
            belt=new Object[][]{

                {"gürtel des basilisken",5,58},
                {"PRI: gürtel des basilisken",8,134},
                {"DUO: gürtel des basilisken",11,401},
                {"TRI: gürtel des basilisken",14,1113},

                {"baumgeistgürtel",5,32},
                {"PRI: baumgeistgürtel",7,77},
                {"DUO: baumgeistgürtel",9,231},
                {"TRI: baumgeistgürtel",11,641},

                {"antiker waffenkern",4,5},
                {"PRI: antiker waffenkern",5,12},
                {"DUO: antiker waffenkern",6,45},
                {"TRI: antiker waffenkern",7,143},

                {"gürtel von shultz dem gladiator",3,1},
                {"PRI: gürtel von shultz dem gladiator",5,4},
                {"DUO: gürtel von shultz dem gladiator",7,13},
                {"TRI: gürtel von shultz dem gladiator",9,42},
                //{"TET: gürtel von shultz dem gladiator",11,97},

                {"baris-gürtel",2,0},
                {"PRI: baris-gürtel",3,0},
                {"DUO: baris-gürtel",4,1},
                {"TRI: baris-gürtel",5,2},
                //{"TET: baris-gürtel",6,4}
            };
        }

        Object[][] result=new Object[results][7];
        for(int z=0; z<results; z++){
            result[z]=new Object[]{"","","","","","",0,java.lang.Integer.MAX_VALUE};
        }
        combo:
        for(int i=0; i<earrings.length; i++){
            for(int j=0; j<earrings.length; j++){
                for(int k=0; k<necklace.length; k++){
                    for(int l=0; l<rings.length; l++){
                        for(int m=0; m<rings.length; m++){
                            for(int n=0; n<belt.length; n++){
                                if(
                                (int)earrings[i][1]+
                                (int)earrings[j][1]+
                                (int)necklace[k][1]+
                                (int)rings[l][1]+
                                (int)rings[m][1]+
                                (int)belt[n][1]
                                >=ap && 
                                (int)earrings[i][2]+
                                (int)earrings[j][2]+
                                (int)necklace[k][2]+
                                (int)rings[l][2]+
                                (int)rings[m][2]+
                                (int)belt[n][2]
                                <(int)result[results-1][7])
                                {
                                    Object[] best=new Object[8];
                                    best[0]=earrings[i][0];
                                    best[1]=earrings[j][0];
                                    best[2]=necklace[k][0];
                                    best[3]=rings[l][0];
                                    best[4]=rings[m][0];
                                    best[5]=belt[n][0];
                                    best[6]= (int)earrings[i][1]+
                                    (int)earrings[j][1]+
                                    (int)necklace[k][1]+
                                    (int)rings[l][1]+
                                    (int)rings[m][1]+
                                    (int)belt[n][1];
                                    best[7]= (int)earrings[i][2]+
                                    (int)earrings[j][2]+
                                    (int)necklace[k][2]+
                                    (int)rings[l][2]+
                                    (int)rings[m][2]+
                                    (int)belt[n][2];
                                    //result[results-1]=best;

                                    //sorted insert instead
                                    /*
                                    Object[] temp=null;
                                    for(int x=1; x<result.length; x++) {
                                    for(int y=0; y<result.length-x; y++) {
                                    if((int)result[y][7]>(int)result[y+1][7]) {
                                    temp=result[y];
                                    result[y]=result[y+1];
                                    result[y+1]=temp;
                                    }
                                    }
                                    }
                                     */
                                    int x=0;
                                    while((int)result[x][7]<(int)best[7]){
                                        x++;
                                    }
                                    for(int y=result.length-1; y>x; y--){
                                        result[y]=result[y-1];
                                    }
                                    result[x]=best;
                                }
                            }
                        }
                    }
                }
            }
        }

        NewJFrame.gogo(result);
    }
}
