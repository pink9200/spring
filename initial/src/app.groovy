@RestController
class ThisWillActuallyRun {

    @GetMapping("/")
    String home() {
        return "Lets go ForceN :"
    }

}