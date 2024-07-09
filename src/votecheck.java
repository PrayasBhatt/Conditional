public class votecheck {
    public static void main(String[] args) {
        int age = 18;
        String citizen = "Nepal";

        if(age >= 18 && citizen == "Nepal"){
            System.out.println("You are allowed to vote in Nepal election");
        }else {
            System.out.println("You are not allowed to vote in Nepal election");
        }
    }
}
