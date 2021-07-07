package telra.homework.config;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import telra.homework.entity.Line;
import telra.homework.entity.Picture;
import telra.homework.entity.Rectangle;
import telra.homework.entity.Shape;

import java.util.ArrayList;
import java.util.List;

@Configuration
public class ShapeConfig {

    @Bean
    @Qualifier("picture1")
    public Shape line1() {
        return new Line('+', 10);
    }

    @Bean
    @Qualifier("picture1")
    public Shape line2() {
        return new Line('=', 10);
    }

    @Bean
    @Qualifier("picture2")
    public Shape line3() {
        return new Line('&', 10);
    }

    @Bean
    @Qualifier("picture1")
    public Shape rectangle() {
        return new Rectangle('@', 10, 6);
    }

    @Bean
    @Qualifier("picture2")
    public Shape rectangle2() {
        return new Rectangle('0', 5, 6);
    }


    @Bean
    public Shape picture(@Qualifier("picture1") List<Shape> list) {

        return new Picture('±', list);
    }

    @Bean
    public Shape picture2(@Qualifier("picture2") List<Shape> list) {

        return new Picture('±', list);
    }
}
