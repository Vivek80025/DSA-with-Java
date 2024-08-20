package DivideConquer_GreedyApproach;

import java.util.*;

public class JobScheduling {
    static class Job{
        char id;
        int deadline;
        int profit;
        public Job(char id,int deadline,int profit){
            this.id = id;
            this.deadline = deadline;
            this.profit = profit;
        }
    }
    public static void printJobSequence(ArrayList<Job> jobs){
        //lembda exp(comparator interface) for sorting the arraylist in decr order
        Collections.sort(jobs,(a,b)->b.profit-a.profit);
        //find maximum deadline
        int maxDeadline = 0;
        for(int i=0;i<jobs.size();i++){
            maxDeadline = Math.max(maxDeadline,jobs.get(i).deadline);
        }
        char[] arr = new char[maxDeadline];
        boolean[] check = new boolean[maxDeadline];

       /*id      : 7, 3, 5, 8, 2, 4, 1, 6, 9
        deadline : 4, 7, 2, 5, 2, 3, 5, 1, 3
        prifit   : 85,75,70,68,65,60,55,50,45 */

        for(int i=0;i< jobs.size();i++){
            //check kro mai iss job ko iss deadline pr rakh sakta hoo?
            for(int j=jobs.get(i).deadline-1;j>=0;j--){
                if(check[j]==false){
                    check[j] = true;
                    arr[j] = jobs.get(i).id;
                    break;
                }
            }
        }

        System.out.println("the sequence of the job scheduling is: ");
        for(char ch : arr){
            System.out.print(ch+" ");
        }
    }
    public static void main(String[] args) {
        ArrayList<Job> jobs = new ArrayList<>();
        jobs.add(new Job('7',4,85));
        jobs.add(new Job('3',7,75));
        jobs.add(new Job('5',2,70));
        jobs.add(new Job('8',5,68));
        jobs.add(new Job('2',2,65));
        jobs.add(new Job('4',3,60));
        jobs.add(new Job('1',5,55));
        jobs.add(new Job('6',1,50));
        jobs.add(new Job('9',3,45));
        printJobSequence(jobs);
    }
}
