package shop.mtcoding.ajax.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@NoArgsConstructor//db조회->pc에 category객체생성->빈생성자를호출
@Setter
@Getter
@Table(name = "category_tb")
@Entity
public class Category {

    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Id
    private Integer id;

    private String name; //백엔드,프론트앤드,DBA

    @Builder
    public Category(Integer id, String name) {
        this.id = id;
        this.name = name;
    }

    
    
}
