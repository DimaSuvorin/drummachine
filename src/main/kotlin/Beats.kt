import java.io.File
import javax.sound.sampled.AudioSystem

fun playBeats(beats: String, file: String) {
    val parts = beats.split("x")
    println("parts = $parts") // ==я== для теста
    //println("beats.length = ${beats.length}")
    var count = 0
    for (part in parts) {
        //print("part.length = ${part.length}  ")
        //print("part = ${part}  ")
        count += part.length + 1
        //println("count = $count") // ==я== для теста
        if (part == "") {
            println("part == \"\" = $part")
            playSound(file)
        } else {
            Thread.sleep(100 * (part.length + 1L))
            if (count < beats.length) {
                println("count < beats.length: part = $part ;count = $count beats.length = ${beats.length}")
                playSound(file)
            }
        }
    }
}

fun playSound(file: String) {
    val clip = AudioSystem.getClip()
    val audioInputStream = AudioSystem.getAudioInputStream(File(file))
    clip.open(audioInputStream)
    clip.start()
}


fun main() {
    println("Hello World!")

    playBeats("x-x-x-x-x-x-", "toms.aiff")
    playBeats("x-----x-----х", "crash_cymbal.aiff")
}