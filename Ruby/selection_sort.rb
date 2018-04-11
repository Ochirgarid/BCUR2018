
def selection_sort(fin)
  fin.each_with_index do |v, ind|
    min_ind = fin.index(fin[ind, fin.length - 1].min)
    fin[ind], fin[min_ind] = fin[min_ind], v
  end
end