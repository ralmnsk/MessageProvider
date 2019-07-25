package by.my.collects.lookup.anno;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component
@Scope("prototype")
public class Singer {
	
private String lyric = "I played a quick game of chess with the saltand pepper shaker";

public void sing() {
//commented because it pollutes the output
System.out.println(this.hashCode()+":"+lyric);
}

}
