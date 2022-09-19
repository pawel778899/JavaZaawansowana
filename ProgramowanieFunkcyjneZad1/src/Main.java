import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) {


        //Season -> Episode -> Video


        Video video = new Video("GOT1", "got1.com", VideoType.CLIP);
        Video video1 = new Video("GOT2", "got2.com", VideoType.EPISODE);
        Video video2 = new Video("GOT3", "got3.com", VideoType.PREVIEW);
        Video video3 = new Video("GOT4", "got4.com", VideoType.CLIP);
        Video video4 = new Video("GOT5", "got5.com", VideoType.PREVIEW);
        Video video5 = new Video("GOTб", "gotб.com", VideoType.EPISODE);
        Video video6 = new Video("GOT7", "got7.com", VideoType.CLIP);

        Episode episode = new Episode("got1", 1, Arrays.asList(video, video1));
        Episode episode1 = new Episode("got2", 2, Arrays.asList(video2, video3));
        Episode episode2 = new Episode("got3", 3, Arrays.asList(video4, video5));
        Episode episode3 = new Episode("got4", 4, Arrays.asList(video6));

        Season season = new Season("GraOTron1", 1, Arrays.asList(episode, episode1));
        Season season1 = new Season("GraOTron2", 2, Arrays.asList(episode2,episode3));

        List<Season> seasons = Arrays.asList(season, season1);


        System.out.println("List of seasons ");
        List<Season> seasons1 = seasons.stream()
                .collect(Collectors.toList());

        seasons1.forEach(System.out::println);
        System.out.println("\n");

        System.out.println("List of episodes ");
        List<Episode> episodes = seasons.stream()
                .flatMap(s -> s.episodes.stream())
                .collect(Collectors.toList());
        episodes.forEach(System.out::println);
        System.out.println("\n");


        System.out.println("List of videos ");
        List<Video> videos = seasons.stream()
                .flatMap(s -> s.episodes.stream())
                .flatMap(e -> e.videos.stream())
                .collect(Collectors.toList());
        videos.forEach(System.out::println);
        System.out.println("\n");


        System.out.println("List of seasons names ");
        List<String> seasonNames = seasons.stream()
                .map(s -> s.seasonName)
                .collect(Collectors.toList());
        seasonNames.forEach(System.out::println);
        System.out.println("\n");


        System.out.println("List of seasons numbers");
        List<Integer> seasonNumbers = seasons.stream()
                .map(s->s.seasonNumber)
                .collect(Collectors.toList());
        seasonNumbers.forEach(System.out::println);
        System.out.println("\n");


        System.out.println("List of episodes names");
        List<String> episodesNames = seasons.stream()
                .flatMap(s -> s.episodes.stream())
                .map(w -> w.episodeName)
                .collect(Collectors.toList());
        episodesNames.forEach(System.out::println);
        System.out.println("\n");


        System.out.println("List of episodes numbers");
        List<Integer> episodesNumbers = seasons.stream()
                .flatMap(s -> s.episodes.stream())
                .map(w->w.episodeNumber)
                .collect(Collectors.toList());
        episodesNumbers.forEach(System.out::println);
        System.out.println("\n");


        System.out.println("List of videos names");
        List<String> videosNames = seasons.stream()
                .flatMap(s -> s.episodes.stream())
                .flatMap(w -> w.videos.stream())
                .map(x -> x.title)
                .collect(Collectors.toList());
        videosNames.forEach(System.out::println);
        System.out.println("\n");


        System.out.println("List of videos URLs");
        List<String> urlsNames = seasons.stream()
                .flatMap(s -> s.episodes.stream())
                .flatMap((w -> w.videos.stream()))
                .map(x -> x.url)
                .collect(Collectors.toList());
        urlsNames.forEach(System.out::println);
        System.out.println("\n");


        System.out.println("List of even episodes");
        List<Episode> evenEpisodes = seasons.stream()
                .flatMap(s -> s.episodes.stream())
                .filter(w -> w.episodeNumber % 2 == 0)
                .collect(Collectors.toList());
        evenEpisodes.forEach(System.out::println);
        System.out.println("\n");


        System.out.println("List of even seasons");
        List<Season> evenSeasons = seasons.stream()
                .filter(s -> s.seasonNumber % 2 ==0)
                .collect(Collectors.toList());
        evenSeasons.forEach(System.out::println);
        System.out.println("\n");


        System.out.println("List of even episodes and seasons");
        List<Episode> evenEpisodesFromEvenSeasons  = seasons.stream()
                .filter(s -> s.seasonNumber % 2 == 0)
                .flatMap(s -> s.episodes.stream())
                .filter((w -> w.episodeNumber % 2 ==0))
                .collect(Collectors.toList());
        evenEpisodesFromEvenSeasons.forEach(System.out::println);
        System.out.println("\n");


        System.out.println("List of clips videos from even episodes and odd seasons ");
        List<Video>  clipVideoFromEvenEpisodesFromOddSeasons  = seasons.stream()
                .filter(s -> s.seasonNumber % 2 != 0)
                .flatMap(s -> s.episodes.stream())
                .filter((w -> w.episodeNumber % 2 == 0))
                .flatMap(w -> w.videos.stream())
                .filter(x ->x.videoType == VideoType.CLIP)
                .collect(Collectors.toList());
        clipVideoFromEvenEpisodesFromOddSeasons.forEach(System.out::println);
        System.out.println("\n");


        System.out.println("List of preview videos from odd episodes and even seasons");
        List<Video>  previewVideoFromOddEpisodesFromEvenSeasons  = seasons.stream()
                .filter(s -> s.seasonNumber % 2 == 0)
                .flatMap(s -> s.episodes.stream())
                .filter((w -> w.episodeNumber % 2 != 0))
                .flatMap(w -> w.videos.stream())
                .filter(x ->x.videoType == VideoType.PREVIEW)
                .collect(Collectors.toList());
        previewVideoFromOddEpisodesFromEvenSeasons.forEach(System.out::println);
        System.out.println("\n");


    }

}
