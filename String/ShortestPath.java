package String;

public class ShortestPath {
    public static float shortestPath(int x , int y , String path){
        int X = x;
        int Y = y;
        for(int i =0 ; i<path.length() ; i++){
            switch (path.charAt(i)) {
                case 'N':
                    Y++;
                    break;
            
                case 'S':
                    Y--;
                    break;
            
                case 'W':
                    X--;
                    break;

                default:
                    X++;
                    break;
            }
        }
        float distance = (float)Math.sqrt( (X-x)*(X-x) + (Y-y)*(Y-y));
        return distance;
    }
    public static void main(String[] args) {
        String path = "WNEENESENNN";
        System.out.println( shortestPath(0, 0, path) );
    }
}
