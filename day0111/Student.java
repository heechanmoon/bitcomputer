package day0111;

public class Student {
    public int id;
    public String name;
    public int korean;
    public int english;
    public int math;

    public Student(){
        id = -1;
        name = "미지정";
    }

    public void print(){
        System.out.printf("번호: %d번 이름: %s\n",id,name);
        System.out.printf("국어: %d점 영어: %d점 수학: %d점\n",korean,english,math);
        System.out.printf("총점: %d점 평균: %.2f점\n",calculateSum(), calculateAvg());
        System.out.println("==================================");
    }

    public double calculateAvg(){
        int sum = calculateSum();
        final int SUBJECT_SIZE = 3;
        double avg = (double)sum/SUBJECT_SIZE;
        return avg;
    }

    public int calculateSum(){
        return korean+english+math;
    }

    public boolean equals(Object object){
        if(object instanceof Student){
            Student s = (Student) object;
            return id == s.id;
        }
        return false;
    }
}
