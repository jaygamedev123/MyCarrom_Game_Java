package com.gamestriker.dto;

import com.gamestriker.entity.Auditing;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import lombok.Getter;
import lombok.Setter;

@Entity
@Setter
@Getter
public class Games {
    @Id
    private String gameId;
    private String gameName;
    private String genre;
    private String platform; // e.g., "PC", "Console", "Mobile"
    private String developer;
    private String publisher;
    private String releaseDate;
    private String rating; // e.g., "E", "T", "M"

}
