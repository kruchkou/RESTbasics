package com.epam.esm.controller;

import com.epam.esm.model.dto.TagDTO;
import com.epam.esm.model.entity.Tag;
import com.epam.esm.service.TagService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("v1/tags")
public class TagController {

    private final TagService tagService;

    @Autowired
    public TagController(TagService tagService) {
        this.tagService = tagService;
    }

    @GetMapping
    public List<TagDTO> getTags() {
        return tagService.getTags();
    }

    @PostMapping
    @ResponseStatus(HttpStatus.CREATED)
    public TagDTO newTag(@RequestBody TagDTO tagDTO) {
        return tagService.createTag(tagDTO);
    }

    @GetMapping("/{id}")
    public TagDTO getGiftCertificateByID(@PathVariable int id) {
        return tagService.getTagByID(id);
    }

    @DeleteMapping("/{id}")
    public void deleteEmployee(@PathVariable int id) {
        tagService.deleteTag(id);
    }

}
