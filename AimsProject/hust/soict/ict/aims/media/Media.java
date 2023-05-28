package AimsProject.hust.soict.ict.aims.media;

import java.util.Comparator;

public class Media {
    private int id;
    private String title;
    private String category;
    private float cost;

//  Getters and Setters
    public int getId() {
        return id;
    }
    public void setId(int id) {
        this.id = id;
    }
    public String getTitle() {
        return title;
    }
    public void setTitle(String title) {
        this.title = title;
    }
    public String getCategory() {
        return category;
    }
    public void setCategory(String category) {
        this.category = category;
    }
    public float getCost() {
        return cost;
    }
    public void setCost(float cost) {
        this.cost = cost;
    }

    public Media() {
    }
    public Media(String title) {
        this.title = title;
    }
    public Media(String title, String category) {
        this.title = title;
        this.category = category;
    }

    public Media(String title, String category, float cost) {
        this.title = title;
        this.category = category;
        this.cost = cost;
    }

//  Comparators
//  Compare by cost then title: return -1 when media1 < media2, 0 when media1 = media2, 1 when media1 > media2
//  Compare by title then cost: return -1 when media1 < media2, 0 when media1 = media2, 1 when media1 > media2

    public static class MediaComparatorByCostTitle implements Comparator<Media> {
        @Override
        public int compare(Media media1, Media media2) {
            int costTitleComparison = Double.compare(media1.getCost(), media2.getCost());
            if (costTitleComparison != 0) {
                return costTitleComparison;
            }else {
                return media1.getTitle().compareTo(media2.getTitle());
            }
        }
    }

    public static class MediaComparatorByTitleCost implements Comparator<Media> {
        @Override
        public int compare(Media media1, Media media2) {
            int titleCostComparison = media1.getTitle().compareTo(media2.getTitle());
            if (titleCostComparison != 0) {
                return titleCostComparison;
            }else {
                return Double.compare(media1.getCost(), media2.getCost());
            }
        }
    }

    public static final Comparator<Media> COMPARE_BY_COST_TITLE = new MediaComparatorByCostTitle();
    public static final Comparator<Media> COMPARE_BY_TITLE_COST = new MediaComparatorByTitleCost();
}
