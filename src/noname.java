import java.util.*;

public class noname {
    public static void main(String[] args) {
        LinkedList<Artist> listOfArtist = new LinkedList<>();

      Artist artist = new Artist("Danile Padilla","M",145);
      Artist artist1 = new Artist("Angel Locsin","F",257);
      Artist artist2 = new Artist("Kathryn Bernardo","F",215);
      Artist artist3 = new Artist("Jose Manalo","M",201);
      Artist artist4 = new Artist("Aleden Richards","M",156);
      Artist artist5 = new Artist("Pokwang","f",233);
      Artist artist6 = new Artist("Piolo Pascual","M",187);
      Artist artist7 = new Artist("Gerald Anderson","M",218);
      Artist artist8 = new Artist("Maine Mendoza","F",178);
      listOfArtist.add(artist);
      listOfArtist.add(artist1);
      listOfArtist.add(artist2);
      listOfArtist.add(artist3);
      listOfArtist.add(artist4);
      listOfArtist.add(artist5);
      listOfArtist.add(artist6);
      listOfArtist.add(artist7);
      listOfArtist.add(artist8);

      int numberOfVotesForFemales = 0;
      String bestFemaleActress = "";
      int numberOfVotesForMales = 0;
      String bestMaleActor = "";

        for(Artist a:listOfArtist){
          if(a.getVote() > numberOfVotesForMales && a.getSex().equalsIgnoreCase("M")){
              numberOfVotesForMales = a.getVote();
              bestMaleActor =a.getName();
          }
          if(a.getVote() > numberOfVotesForFemales && a.getSex().equalsIgnoreCase("F")){
              numberOfVotesForFemales =a.getVote();
              bestFemaleActress = a.getName();
          }
      }

        System.out.println("The best Actor is: " + bestMaleActor);
        System.out.println("The best Actress is: "+ bestFemaleActress);

    }
    public static class Artist{
        private String name, sex;
        int vote;

        public Artist(String name, String sex, int vote) {
            this.name = name;
            this.sex = sex;
            this.vote = vote;
        }

        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }

        public String getSex() {
            return sex;
        }

        public void setSex(String sex) {
            this.sex = sex;
        }

        public int getVote() {
            return vote;
        }

        public void setVote(int vote) {
            this.vote = vote;
        }
    }

}
