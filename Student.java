class Student {
    String index;
    String firstName;
    String lastName;
    List<Integer> grades;

    //TODO constructor
    public Student(String index, String firstName, String lastName, List<Integer> grades){
        this.index = index;
        this.firstName = firstName;
        this.lastName = lastName;
        this.grades = grades;

    }
    //TODO seters & getters
    public String getIndex(){
        return index;
    }

    public String getFirstName(){
        return firstName;
    }

    public String getLastName(){
        return lastName;
    }

    public List<Integer> getGrades(){
        return grades;
    }

    public void setIndex(String index){
        this.index = index;
    }

    public void setFirstName(String firstName){
        this.firstName = firstName;
    }

    public void setLastName(String lastName){
        this.lastName = lastName;
    }

    public void setGrades(List<Integer> grades){
        this.grades = grades;
    }

    public double getAverage() {
        //TODO
        double average = 0;
        double sum = 0;
        for(int i=0;i<grades.size();i++){
            sum += grades.get(i);
        }
        average = sum/grades.size();
        return average;
    }

    public int ECTSCredits() {
        //TODO
        int credits = 0;
        for(int i=0;i<grades.size();i++){
            if(grades.get(i) > 5){
                credits += 6;
            }
        }
        return credits;
    }
}

class Faculty{
    List<Student> students;
    String facultyName;

    public void addStudent(Student nov){
        students.add(nov);
    }

    public void removeStudent(Student otpisan){
        students.remove(otpisan);
    }

    public double averageAll(){
        double average = 0;
        double sum = 0;
        for(Student s: students){
            sum += s.getAverage();
        }
        average = sum/students.size();
        return average;
    }
}