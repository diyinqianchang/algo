package door;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.ListIterator;
import java.util.Scanner;

/**
 * @author zhangguolin
 * @date 2021/8/8 上午10:35
 *
 *
 * 定义一个双向链表 将1~n  依次放入链表尾部
 * 如果链表中元素个数>3 则计数器cnt = 1；遍历链表 如果cnt++%k == 0 则删除当前元素，否则指向下一个继续计数；
 *
 * 首先k=2报数，报数结束后，再k=3报数，交替进行
 *
 */
public class Link {

    public static void main(String[] args) {

        Integer t,n;
        LinkedList<Integer> a = new LinkedList<>();
        Iterator<Integer> iterator;
        Scanner scanner = new Scanner(System.in);
        t =  scanner.nextInt();

        while (t>0){
            n = scanner.nextInt();
            a.clear();
            int k = 2;
            int j = 1;
            for (int i = 1; i <= n; i++) {
                a.addLast(i);
            }
            while (a.size()>3){
                int cnt = 1;
                iterator = a.iterator();
                while (iterator.hasNext()){
                    iterator.next();
                    if (cnt++ % k == 0){
                        iterator.remove();
                    }
                }
                k = (k==2?3:2);
            }
            System.out.println(a);
            t--;
        }
    }

}
