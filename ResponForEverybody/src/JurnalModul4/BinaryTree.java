package JurnalModul4;
import static java.lang.Math.abs;
public class BinaryTree {
    public class Node{
        String data;
        int indeks;
        Node parent;
        Node left;
        Node right;
        Node (String data,int indeks){
            this.data=data;
            this.indeks = indeks;
        }
    }
    Node root;
    Node current;
    public void insert(String data, int indeks){
        Node newNode = new Node(data,indeks);
        if (root==null){
            root = newNode;
            System.out.println(root.data+" dibuat sebagai ROOT "+root.indeks);
        }else{
            current=root;
            while(true){
                if (decision(indeks,current.indeks)%2==0){
                    if (decision(indeks,current.indeks)==indeks){
                        current.left=newNode;
                        current.left.parent=current;
                        System.out.println(current.left.data+ " ditambahkan sebagai LEFT child dari "+ current.left.parent.data +" "+current.left.indeks);
                        break;
                    }
                    current=current.left;
                }else{
                    if (decision(indeks,current.indeks)==indeks){
                        current.right=newNode;
                        current.right.parent=current;
                        System.out.println(current.right.data+ " ditambahkan sebagai RIGHT child dari "+ current.right.parent.data +" "+current.right.indeks);
                        break;
                    }
                    current=current.right;
                }
            }
        }
    }
    public int decision(int indeks,int parentIndeks){
        while(indeks>(parentIndeks*2)+1){
            indeks=indeks/2;
        }
        return indeks;
    }
    public void relationOf(int leftindeks, int rightIndeks){
        current=root;
        Node kiri = search(leftindeks);
        Node kanan = search(rightIndeks);
        int levelKiri = getLevelOf(kiri);
        int levelKanan = getLevelOf(kanan);
        int status = abs(levelKiri-levelKanan);
        if (status==0){
            if (kiri.parent.indeks-kanan.parent.indeks==0){
                System.out.println(kiri.data+" adalah saudara dari "+kanan.data);
            }else if(abs(kiri.parent.indeks-kanan.parent.indeks)==1){
                if (kiri.parent.parent!=null){
                    if (kiri.parent.parent!=kanan.parent.parent){
                        System.out.println(kiri.data+" adalah sepupu jauh dari "+kanan.data);
                        return;
                    }
                }
                System.out.println(kiri.data+" adalah sepupu dari "+kanan.data);

            }else{
                System.out.println(kiri.data+" adalah sepupu jauh dari "+kanan.data);
            }
        }else if (status==1) {
            if (kiri.indeks/2==kanan.indeks||kanan.indeks/2==kiri.indeks){
                if (kiri.indeks<kanan.indeks){
                    System.out.println(kiri.data+" adalah orang tua dari "+kanan.data);
                }else{
                    System.out.println(kiri.data+" adalah anak dari "+kanan.data);
                }
            }else{
                if (kiri.parent!=root||kanan.parent!=root){
                    if (kiri.indeks<kanan.indeks){
                        if (kiri.parent==kanan.parent.parent){
                            System.out.println(kiri.data+ " adalah paman/bibi dari "+kanan.data);
                        }else{
                            System.out.println(kiri.data+ " adalah paman/bibi jauh dari "+kanan.data);
                        }
                    }else{
                        if (kanan.parent==kiri.parent.parent){
                            System.out.println(kiri.data+ " adalah keponakan dari "+kanan.data);
                        }else{
                            System.out.println(kiri.data+ " adalah keponakan jauh dari "+kanan.data);
                        }
                    }
                }
            }
        }else if(status==2){
            if (kiri.indeks<kanan.indeks){
                if (kiri.indeks==kanan.parent.parent.indeks){
                    System.out.println(kiri.data+" adalah kakek/nenek dari "+kanan.data);
                }else{
                    System.out.println(kiri.data+" adalah kakek/nenek jauh dari "+kanan.data);
                }
            }else {
                if (kiri.parent.parent.indeks==kanan.indeks){
                    System.out.println(kiri.data+" adalah cucu dari "+kanan.data);
                }else{
                    System.out.println(kiri.data+" adalah cucu jauh dari "+kanan.data);
                }
            }
        }else {
            if (kiri.indeks<kanan.indeks){
                System.out.println(kiri.data+" adalah Balo' dari "+kanan.data);
            }else{
                System.out.println(kiri.data+" adalah cicit dari "+kanan.data);
            }
        }
    }
    public int getLevelOf(Node param){
        current=root;
        if (param==root) return 1;
        int count=0;
        while(current!=null){
            count++;
            if (current.parent!=null){
                if (param.indeks<=current.indeks&&
                        param.indeks>current.parent.indeks){
                    return count;
                }
            }
            current=current.right;
        }
        return count;
    }
    public Node search(int indeks){
        current = root;
        while (current!=null){
            if (decision(indeks,current.indeks)%2==0){
                if (current.indeks==indeks)break;
                current=current.left;
            }else{
                if (current.indeks==indeks)break;
                current=current.right;
            }
        }
        return current;
    }
    public void preOrder(Node node){
        if (node==null) return;
        if (node.left != null) {
            System.out.println(node.data+" : "+node.left.data+" & "+node.right.data);
        }else{
            System.out.println(node.data+" : -");

        }
        preOrder(node.left);
        preOrder(node.right);
    }
    public void printPreorder(){preOrder(root);}
    public void Inorder(Node node){
        if (node == null)return;
        Inorder(node.left);
        if (node.left != null) {
            System.out.println(node.data+" : "+node.left.data+" & "+node.right.data);
        }else{
            System.out.println(node.data+" : -");
        }
        Inorder(node.right);
    }
    void printInorder() {Inorder(root); }
    void Postorder(Node node)
    {
        if (node == null)return;
        Postorder(node.left);
        Postorder(node.right);
        if (node.left != null) {
            System.out.println(node.data+" : "+node.left.data+" & "+node.right.data);
        }else{
            System.out.println(node.data+" : -");
        }
    }
    void printPostorder() { Postorder(root); }
}