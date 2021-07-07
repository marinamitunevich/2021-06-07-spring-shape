package telra.homework;

import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.context.annotation.Configuration;
import telra.homework.entity.Shape;

@Configuration

public class ShapeFlow implements ApplicationRunner {

    private Shape marina1;
    private Shape marina2;
    private Shape marina3;
    private Shape rectangle;
    private Shape picture1;
    private Shape picture2;

    public ShapeFlow(Shape line1, Shape line2, Shape line3, Shape rectangle, Shape picture,
                     Shape picture2) {
        this.marina1 = line1;
        this.marina2 = line2;
        this.marina3 = line3;
        this.rectangle = rectangle;
        this.picture1 = picture;
        this.picture2 = picture2;
    }

    @Override
    public void run(ApplicationArguments args) throws Exception {

        picture1.draw();
        picture2.draw();

    }
}
