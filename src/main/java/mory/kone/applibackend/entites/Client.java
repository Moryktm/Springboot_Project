package mory.kone.applibackend.entites;
import jakarta.persistence.*;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

@Entity // Pour dire c'est une entité qui est mappé dans ma base de donnée
@Table(name="CLIENT") //On definit alors la table qui sera mappée
public class Client {
    @Id // C'est pour preciser lequel des champs est la clé primaire.
    @GeneratedValue(strategy = GenerationType.IDENTITY) // C'est pour indiquer comment les cles primaires sont generées (generer automatiquement dans la BD)
    private int id;
    private String email;


    private static final String EMAIL_REGEX = "^[A-Za-z0-9._%+-]+@[A-Za-z0-9.-]+\\.[A-Za-z]{2,}$";
    private static final Pattern EMAIL_PATTERN = Pattern.compile(EMAIL_REGEX);


    public Client(String email, int id) {
        this.email = email;
        this.id = id;
    }

    public String getEmail(){
        return email;
    }

    public void setEmail(String email){
        Matcher matcher = EMAIL_PATTERN.matcher(email);
        if(matcher.matches()){
            this.email=email;
        }
    }

    public int getId(){
        return id;
    }

    public void setId(int id){
        this.id=id;
    }
}
