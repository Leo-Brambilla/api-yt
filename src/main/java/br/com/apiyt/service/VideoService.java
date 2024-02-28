package br.com.apiyt.service;

import br.com.apiyt.model.Video;

import java.util.List;

public interface VideoService {
    Video findByIdVideo(int id);
    List<Video> findVideosByPlaylist(int idPlaylist);
    List<Video> findVideobyCategory(String category);
    void saveVideo(Video video);
    void updateVideo(int id, String newTitle, String newDescription);
    void deleteVideo(int id);
}
