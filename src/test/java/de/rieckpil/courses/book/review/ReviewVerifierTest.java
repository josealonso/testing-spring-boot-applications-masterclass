package de.rieckpil.courses.book.review;

import org.junit.jupiter.api.*;

import static org.junit.jupiter.api.Assertions.*;

class ReviewVerifierTest {

  private ReviewVerifier reviewVerifier;

  @BeforeEach
  void setup() {
    reviewVerifier = new ReviewVerifier();
  }

  @BeforeAll
  static void beforeAll() {
    System.out.println("Before All");
  }

  @AfterAll
  static void afterAll() {
    System.out.println("After All");
  }

  @Test    // The method visibility does not really matter
  void shouldFailWhenReviewContainsSwearWord() {
    String review = "This book is shit";

    boolean result = reviewVerifier.doesMeetQualityStandards(review);
    assertFalse(result, "ReviewVerifier did not detect swear word.");
//    assertFalse(result);
//    assertEquals(false, result);
  }
}
