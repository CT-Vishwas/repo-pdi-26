# App4: Media Player

## Overview
A simple HTML5 media player demonstrating audio and video elements. Shows how to embed multimedia content directly in web pages using semantic HTML5 tags.

## Purpose
Learn and practice:
- HTML5 `<video>` element and attributes
- HTML5 `<audio>` element and attributes
- Media controls and playback options
- Source element for format flexibility
- Responsive media sizing

## Video Element

### Basic Video
```html
<video controls width="640">
    <source src="sample.mp4" type="video/mp4">
    Your browser doesn't support HTML5 video
</video>
```

### Video Attributes

| Attribute | Purpose | Values |
|-----------|---------|--------|
| `controls` | Show player controls | Boolean |
| `autoplay` | Start playing automatically | Boolean |
| `muted` | Start without sound | Boolean |
| `loop` | Repeat when finished | Boolean |
| `width` | Video width | Pixels |
| `height` | Video height | Pixels |
| `poster` | Thumbnail image | Image URL |

### Video Example
```html
<video controls loop width="640" height="480">
    <source src="sample.mp4" type="video/mp4">
    <source src="sample.webm" type="video/webm">
    Your browser doesn't support HTML5 video.
</video>
```

## Audio Element

### Basic Audio
```html
<audio src="sample_audio.mp3" controls></audio>
```

### Audio Attributes

| Attribute | Purpose | Values |
|-----------|---------|--------|
| `controls` | Show player controls | Boolean |
| `autoplay` | Start playing automatically | Boolean |
| `muted` | Start without sound | Boolean |
| `loop` | Repeat when finished | Boolean |
| `preload` | Load strategy | auto, metadata, none |

### Audio Example
```html
<audio src="sample_audio.mp3" controls muted></audio>
```

## Media Formats

### Video Formats
```html
<!-- MP4 (H.264) - Most compatible -->
<source src="video.mp4" type="video/mp4">

<!-- WebM (VP8/VP9) - Open source -->
<source src="video.webm" type="video/webm">

<!-- Ogg (Theora) - Older format -->
<source src="video.ogv" type="video/ogg">
```

### Audio Formats
```html
<!-- MP3 - Most compatible -->
<source src="audio.mp3" type="audio/mpeg">

<!-- OGG (Vorbis) - Open source -->
<source src="audio.ogg" type="audio/ogg">

<!-- WAV - Uncompressed -->
<source src="audio.wav" type="audio/wav">

<!-- WebM Audio -->
<source src="audio.webm" type="audio/webm">
```

## Codec Compatibility

| Format | Audio Codec | Video Codec | Support |
|--------|------------|------------|---------|
| MP3 | MPEG-3 | - | Excellent |
| MP4 | AAC | H.264 | Excellent |
| OGG | Vorbis | Theora | Good |
| WebM | Vorbis | VP8/VP9 | Good |
| WAV | PCM | - | Good |

## Source Element

Allows multiple formats for browser compatibility:

```html
<video controls>
    <source src="video.mp4" type="video/mp4">
    <source src="video.webm" type="video/webm">
    <source src="video.ogv" type="video/ogg">
    Your browser doesn't support HTML5 video
</video>
```

Browser uses first supported format.

## Player Controls

Default controls include:
- Play/Pause button
- Seek bar (timeline)
- Volume control
- Fullscreen button (video)
- Time display

## Advanced Attributes

### Preload
```html
<!-- Load metadata (default) -->
<audio src="audio.mp3" preload="metadata"></audio>

<!-- Load entire file -->
<audio src="audio.mp3" preload="auto"></audio>

<!-- Don't preload -->
<audio src="audio.mp3" preload="none"></audio>
```

### Poster (Video Only)
```html
<!-- Show thumbnail before play -->
<video poster="thumbnail.jpg" controls>
    <source src="video.mp4" type="video/mp4">
</video>
```

### Crossorigin
```html
<!-- For videos from CDN -->
<video crossorigin="anonymous" controls>
    <source src="https://cdn.example.com/video.mp4">
</video>
```

## JavaScript Control

Control media with JavaScript:

```javascript
// Get element
const video = document.querySelector('video');
const audio = document.querySelector('audio');

// Methods
video.play();
video.pause();
video.currentTime = 10;  // Jump to 10 seconds

// Events
video.addEventListener('play', function() {
    console.log('Playing');
});
video.addEventListener('ended', function() {
    console.log('Finished');
});
```

## Responsive Video

### CSS for Responsive Video
```css
video, audio {
    max-width: 100%;
    height: auto;
}

/* Video container */
.video-container {
    position: relative;
    padding-bottom: 56.25%;  /* 16:9 aspect ratio */
    height: 0;
    overflow: hidden;
}

.video-container video {
    position: absolute;
    top: 0;
    left: 0;
    width: 100%;
    height: 100%;
}
```

## Accessibility Features

✓ Visible controls
✓ Keyboard controls
✓ Captions (with tracks)
✓ Transcripts
✓ Play/pause animation warnings
✓ Volume information

### Adding Captions
```html
<video controls>
    <source src="video.mp4" type="video/mp4">
    <track kind="captions" src="captions.vtt" srclang="en">
    <track kind="subtitles" src="subs.vtt" srclang="es">
</video>
```

## Best Practices

1. **Multiple Formats** - Provide fallback formats
2. **Controls** - Always show controls
3. **Playback Options** - Consider autoplay implications
4. **File Size** - Optimize for web delivery
5. **Accessibility** - Include captions if possible
6. **Responsive** - Make videos responsive
7. **User Consent** - Don't mute audio unexpectedly

## File Organization

```
app4/
├── index.html          # Media player page
├── sample.mp4          # Sample video
├── sample.webm         # Video alternative
└── sample_audio.mp3    # Audio sample
```

## Learning Outcomes

After reviewing this app, you'll understand:
- HTML5 video and audio elements
- Media attributes (controls, loop, muted, etc.)
- Source element for format compatibility
- Media types and codecs
- Responsive video sizing
- Media events and properties
- Accessibility considerations

## How to View

1. Open `index.html` in browser
2. Click play button on video
3. Test controls (pause, seek, volume)
4. Test loop functionality
5. Try audio player
6. Resize window for responsive test

## Testing Media

### Video Testing
```html
<video controls loop width="640">
    <source src="sample.mp4" type="video/mp4">
</video>
```
- Play/pause works ✓
- Seek bar functions ✓
- Loop repeats ✓
- Volume controls work ✓

### Audio Testing
```html
<audio src="sample_audio.mp3" controls muted></audio>
```
- Controls visible ✓
- Starts muted ✓
- Play/pause works ✓

## Performance Optimization

### Reduce File Size
1. Use appropriate codec
2. Compress media
3. Use correct resolution
4. Consider streaming services
5. Use CDN for delivery

### Lazy Loading
```html
<!-- Load only when visible -->
<video loading="lazy" controls>
    <source src="video.mp4">
</video>
```

## Browser Support

| Browser | Video | Audio |
|---------|-------|-------|
| Chrome | ✓ | ✓ |
| Firefox | ✓ | ✓ |
| Safari | ✓ | ✓ |
| Edge | ✓ | ✓ |
| IE 11 | ✗ | ✗ |

## Common Issues

| Issue | Solution |
|-------|----------|
| Video not playing | Check format support, file path |
| No controls visible | Add `controls` attribute |
| Auto muted in Chrome | Chrome requires muted for autoplay |
| CORS errors | Add crossorigin attribute |

## Practice Exercises

### Easy
1. Add multiple video sources
2. Change video dimensions
3. Add muted attribute to video

### Medium
3. Create responsive video container
4. Add poster image to video
5. Style media players with CSS

### Hard
6. Create custom controls with JavaScript
7. Add captions with track element
8. Implement streaming with HLS/DASH

## Next Steps

1. Add captions for accessibility
2. Create custom player controls
3. Optimize video for mobile
4. Implement video analytics
5. Add subtitles in multiple languages

## References

### Documentation
- MDN: [HTML5 Video](https://developer.mozilla.org/en-US/docs/Web/HTML/Element/video)
- MDN: [HTML5 Audio](https://developer.mozilla.org/en-US/docs/Web/HTML/Element/audio)
- [Can I Use](https://caniuse.com/) - Browser compatibility

### Tools
- FFmpeg - Video conversion
- HandBrake - Video encoding
- Audacity - Audio editing

## Key Takeaways

✓ HTML5 media elements are simple to use
✓ Multiple formats improve compatibility
✓ Controls should always be visible
✓ Responsive sizing is important
✓ Accessibility should be considered
✓ Optimize file sizes for web

## Author
Vishwas K Singh

## License
MIT

---

**[← Back to Frontend Basics](../README.md)** | **[Previous: App3](../app3/README.md)** | **[Next: App5 →](../app5/README.md)**
