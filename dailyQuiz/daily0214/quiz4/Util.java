package daily0214.quiz4;

public class Util {
    public static <K,V> V getValue(Pair<K,V> pair, K key) {
        if(key.equals(pair.getKey())){
            return pair.getValue();
        }
        return null;
    }

    //extends 쓰는 방식
    /**
     *     public static <K, V, T extends Pair<K, V>> V getValue(T pair, K key) {
     *         if (pair != null && key != null && key.equals(pair.getKey())) {
     *             return pair.getValue();
     *         }
     *         return null;
     *     }
     */
}
