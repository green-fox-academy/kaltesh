package BlogPost;

public class Main {
  public static void main(String[] args) {

    Blogpost newBlog = new Blogpost("John Doe", "Loremipsum", "moreLoremipsum", "2005.04.15" );
    Blogpost newBlog2 = new Blogpost("Jani","Alkoholizmus", "erdekes olvasmany", "2006.06.06");
    Blogpost newBlog3 = new Blogpost("Pityu", "Drogokrol", "Dont do drugs", "20011.11.11");


  }
}

//  BlogPost
//  Create a BlogPost class that has
//      an authorName
//      a title
//      a text
//      a publicationDate
//      Create a few blog post objects:
//      "Lorem Ipsum" titled by John Doe posted at "2000.05.04."
//  Lorem ipsum dolor sit amet.
//"Wait but why" titled by Tim Urban posted at "2010.10.10."
//  A popular long-form, stick-figure-illustrated blog about almost everything.
//"One Engineer Is Trying to Get IBM to Reckon With Trump" titled by William Turton at "2017.03.28."