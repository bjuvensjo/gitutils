package git

// All repositories in root and its subdirectories will be pushed

def defaultRoot = new File(".")
def root = args ? new File(args[0]) : defaultRoot

new LocalCommand().execute(root, "git push", { output -> 
    !(output =~ /Everything up-to-date/)
})