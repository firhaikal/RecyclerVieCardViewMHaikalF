package com.example.recyclerviecardview;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.recyclerview.widget.RecyclerView;

import java.util.List;

public class SongAdapter extends RecyclerView.ViewHolder {
    public TextView tvRank,tvSongName,tvSinger,tvYear;
    public ImageView ivAlbumCover;

    public SongAdapter(View v){
        super(v);
        tvRank = (TextView)v.findViewById(R.id.tv_rank);
        tvSongName = (TextView)v.findViewById(R.id.tv_song_name);
        tvSinger = (TextView)v.findViewById(R.id.tv_singer);
        tvYear = (TextView)v.findViewById(R.id.tv_year);
        ivAlbumCover = (ImageView)v.findViewById(R.id.iv_album_cover);
    }

    public  SongAdapter(List<Song> songList) {
        this.songList = songList;
    }

    public RecyclerView.ViewHolder onCreateViewHolder(ViewGroup parent, int viewType){

        View v =
                LayoutInflater.from(parent.getContext()).inflate(R.layout.song_list_item,parent,false);
        RecyclerView.ViewHolder vh = new RecyclerView.ViewHolder() {
        }.ViewHolder(v);
        return vh;
    }

    public void onBindViewHolder(SongAdapter.ViewHolder holder, int position){
        Song song = songList.get(position);
        holder.tvRank.setText(String. valueOf(song.getRank()));
        holder.tvSongName.setText (song.getName());
        holder.tvSinger.setText (song.getSinger());
        holder.tvYear.setText (song.getYear());
        holder.ivAlbumCover.setImageResource(song.getPic());
        holder.tvYear.setText("2016");
    }

    @Override
    public int getItemCount(){
        return songList.size();
    }
}
