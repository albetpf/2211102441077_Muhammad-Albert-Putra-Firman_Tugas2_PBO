import greenfoot.*;

public class bird extends Actor
{
    private GreenfootImage image1;
    private GreenfootImage image2;
    private GreenfootImage image3;
    private GreenfootImage image4;
    
    private int frame = 1;
    private int animationDelay = 10;
    private int speed = 5; // Kecepatan gerakan Burung
    private int direction = 1; // 1 untuk bergerak ke atas, -1 untuk bergerak ke bawah

    public void act() {
        animate(); // Memanggil fungsi animate() untuk mengganti gambar burung
        // Gerakkan burung ke atas dan ke bawah
        setLocation(getX(), getY() + (speed * direction));
        
        // Ganti arah gerakan jika burung mencapai batas atas atau bawah
        if (getY() >= getWorld().getHeight() - 1) { // Batas bawah dunia
            direction = -1; // Ubah arah ke atas
        } else if (getY() <= 0) { // Batas atas dunia
            direction = 1; // Ubah arah ke bawah
        }
    }
    
    public bird()
    {
        // Konstruktor bird, dipanggil saat objek bird dibuat
        image1 = new GreenfootImage("1.png");
        image2 = new GreenfootImage("2.png");
        image3 = new GreenfootImage("3.png");
        image4 = new GreenfootImage("4.png");
        
        // Mengubah ukuran gambar menjadi 50% dari ukuran aslinya
        image1.scale(image1.getWidth() / 5, image1.getHeight() / 5);
        image2.scale(image2.getWidth() / 5, image2.getHeight() / 5);
        image3.scale(image3.getWidth() / 5, image3.getHeight() / 5);
        image4.scale(image4.getWidth() / 5, image4.getHeight() / 5);
        
        setImage(image1); // Mengatur gambar awal untuk objek burung
    }

    private void animate()
    {
        // Fungsi untuk mengganti gambar burung secara berurutan
        if (frame == animationDelay)
        {
            switchImage();
            frame = 1;
        }
        else
        {
            frame++;
        }
    }

    private void switchImage()
    {
        // Fungsi untuk mengganti gambar burung ke gambar berikutnya
        if (getImage() == image1)
        {
            setImage(image2);
        }
        else if (getImage() == image2)
        {
            setImage(image3);
        }
        else if (getImage() == image3)
        {
            setImage(image4);
        }
        else
        {
            setImage(image1);
        }
    }
}
