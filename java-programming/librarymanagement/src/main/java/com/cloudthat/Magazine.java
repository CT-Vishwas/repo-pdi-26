package com.cloudthat;

public class Magazine extends Book{
    private int issueNumber;
    private String issueDate;

    public Magazine(int issueNumber, String issueDate) {
        this.issueNumber = issueNumber;
        this.issueDate = issueDate;
    }

    public Magazine(String isbn, String title, String author, int issueNumber, String issueDate) {
        super(isbn, title, author);
        this.issueNumber = issueNumber;
        this.issueDate = issueDate;
    }

    public int getIssueNumber() {
        return issueNumber;
    }

    public void setIssueNumber(int issueNumber) {
        this.issueNumber = issueNumber;
    }

    public String getIssueDate() {
        return issueDate;
    }

    public void setIssueDate(String issueDate) {
        this.issueDate = issueDate;
    }

    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;

        Magazine magazine = (Magazine) o;
        return getIssueNumber() == magazine.getIssueNumber() && getIssueDate().equals(magazine.getIssueDate());
    }

    @Override
    public int hashCode() {
        int result = super.hashCode();
        result = 31 * result + getIssueNumber();
        result = 31 * result + getIssueDate().hashCode();
        return result;
    }

    @Override
    public String toString() {
        return "Magazine{" +
                " title="+super.getTitle() +
                ", author="+super.getAuthor()+
                ", issueNumber=" + issueNumber +
                ", issueDate='" + issueDate + '\'' +
                '}';
    }
}
