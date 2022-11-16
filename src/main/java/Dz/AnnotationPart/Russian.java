package Dz.AnnotationPart;

import org.springframework.beans.factory.annotation.Autowired;

public class Russian {
    @Autowired
    private String message;

    public void getMessage(){
        System.out.println(message);
    }
}
