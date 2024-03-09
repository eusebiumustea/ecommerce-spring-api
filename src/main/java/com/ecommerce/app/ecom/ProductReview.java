package com.ecommerce.app.ecom;

public class ProductReview {
  private int points;
  private String title;
  private String description;
  public int getPoints() {
    return points;
  }

  public void setPoints(int points) {
    this.points = points;
  }

  public String getTitle() {
    return title;
  }

  public void setTitle(String title) {
    this.title = title;
  }

  public String getDescription() {
    return description;
  }

  public void setDescription(String description) {
    this.description = description;
  }

  public ProductReview(int points, String title, String description) {
    this.points = points;
    this.title = title;
    this.description = description;
  }
}
