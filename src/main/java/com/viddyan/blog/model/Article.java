package com.viddyan.blog.model;

import java.time.LocalDateTime;

public record Article(Integer id, String title, String Content, String publishedOn) {
}
