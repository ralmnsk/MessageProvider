package by.my.collects.lookup;

public class Singer {
	
private String lyric = "I played a quick game of chess with the saltand pepper shaker";

public void sing() {
//commented because it pollutes the output
System.out.println(this.hashCode()+":"+lyric);
}

}
