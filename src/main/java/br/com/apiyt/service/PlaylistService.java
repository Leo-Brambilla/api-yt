package br.com.apiyt.service;


import br.com.apiyt.model.Playlist;

public interface PlaylistService {
    Playlist createPlaylist(String name, String description);
    Playlist findByIdPlaylist(int id);
    Playlist findAllPlaylist();
    void addVideo(int idPlaylist, String urlVideo);
    void deleteVideo(int idPlaylist, int idVideo);
    void updatePlaylist(int id, String newName, String newDescripton);
    void deletePlaylist(int id);

}
