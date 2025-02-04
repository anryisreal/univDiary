package ru.NoteChecker.UniversityMember.data;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.Data;
import ru.NoteChecker.UniversityMember.data.postComponent.Category;
import ru.NoteChecker.UniversityMember.data.postComponent.VisionMode;

@Data
@Entity
public class Post {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String link;
    private String content;
}
