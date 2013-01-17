package com.kskkbys.loop.playlist;

import java.util.ArrayList;
import java.util.List;

import com.kskkbys.loop.Video;

/**
 * Playlist class
 *
 */
public class Playlist {

	private static Playlist mInstance = new Playlist();
	
	private List<Video> mVideoList;
	private int mPlayingIndex;
	
	/**
	 * Constructor
	 */
	private Playlist() {
		this.mVideoList = new ArrayList<Video>();
		this.mPlayingIndex = -1;
	}
	
	/**
	 * Get instance of playlist
	 * @return
	 */
	public static Playlist getInstance() {
		return mInstance;
	}
	
	/**
	 * Get the current playing video
	 * @return
	 */
	public Video getCurrentVideo() {
		if (mVideoList != null && mPlayingIndex >= 0 && mPlayingIndex < mVideoList.size()) {
			return mVideoList.get(mPlayingIndex);
		} else {
			// invalid index or not initialized
			return null;
		}
	}
	
	/**
	 * Set video list. The playing index is set to 0.
	 * @param videos
	 */
	public void setVideoList(List<Video> videos) {
		this.mVideoList = videos;
		if (mVideoList != null && mVideoList.size() > 0) {
			this.mPlayingIndex = 0;
		} else {
			this.mPlayingIndex = -1;
		}
	}
	
	/**
	 * Play previous video
	 */
	public void prev() {
		this.mPlayingIndex--;
	}
	
	/**
	 * Play next video
	 */
	public void next() {
		this.mPlayingIndex++;
	}
	
	/**
	 * Set the playing index
	 * @param index
	 */
	public void setPlayingIndex(int index) {
		this.mPlayingIndex = index;
	}
	
	/**
	 * Get the playing index
	 * @return
	 */
	public int getPlayingIndex() {
		return mPlayingIndex;
	}
	
	/**
	 * Get count of video list
	 * @return
	 */
	public int getCount() {
		return mVideoList.size();
	}
	
	public Video getVideoAtIndex(int index) {
		return mVideoList.get(index);
	}
}